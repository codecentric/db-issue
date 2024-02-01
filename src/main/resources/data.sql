INSERT INTO release(id, release_version)
VALUES (1, '1.00'),
       (2, '2.00');

INSERT INTO stuff(id, name, option, flag, release_id)
VALUES (1, 'SQL', 'ALPHA', 'GREEN', 1),
       (2, 'Java', 'ALPHA', 'RED', 1),
       (3, 'Python', 'BETA', 'GREEN', 2),
       (4, 'Ruby', 'BETA', 'RED', 2),
       (5, 'Ada95', 'BETA', 'BLUE', 2);


