package com.example.dbissue;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DbServiceTests {

	@Autowired
	DbService dbService;

	@Test
	void shouldWorkWithoutHack() {
		List<String> myStuff = dbService.getStuff("BETA", "BLUE", false);

		assertEquals(1, myStuff.size());
		assertEquals("Ada95", myStuff.get(0));
	}

	@Test
	void shouldWorkWithHack() {
		List<String> myStuff = dbService.getStuff("BETA", "BLUE", true);

		assertEquals(1, myStuff.size());
		assertEquals("Ada95", myStuff.get(0));
	}
}
