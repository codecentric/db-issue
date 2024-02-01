package com.example.dbissue;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DbService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DbService.class);

    private final NamedParameterJdbcTemplate namedJdbcTemplate;

    DbService(NamedParameterJdbcTemplate namedJdbcTemplate) {
        this.namedJdbcTemplate = namedJdbcTemplate;
    }

    public List<String> getStuff(String option, String flag, boolean withHack) {
        Map<String, Object> parameterMap = Map.of("option", option, "flag", flag, "releaseId", 2);
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        try (final InputStream inputStream = classloader.getResourceAsStream("query.sql")) {
            if (inputStream == null) {
                throw new FileNotFoundException();
            }
            String query = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

            if (withHack) {
                query = query
                        .replace(":option", "'" + option + "'")
                        .replace(":flag", "'" + flag + "'")
                        .replace(":releaseId", "'2'");
            }

            return namedJdbcTemplate.query(
                    query,
                    parameterMap,
                    (ResultSet rs, int rowNum) -> rs.getString("name"));
        } catch (final Exception e) {
            LOGGER.error("Query not found", e);
            return List.of();
        }
    }
}
