WITH q1 AS (SELECT R.RELEASE_VERSION FROM RELEASE R WHERE R.ID = :releaseId),
     X AS (SELECT S.*
           FROM stuff S
                    LEFT JOIN RELEASE rel ON S.release_id = rel.ID
              , q1

           WHERE option = :option
             AND rel.RELEASE_VERSION = q1.RELEASE_VERSION)

SELECT *
FROM X
WHERE option = :option;
