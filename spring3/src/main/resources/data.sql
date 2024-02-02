INSERT INTO release(id, release_version)
VALUES (1, '1.00'),
       (2, '2.00');

INSERT INTO stuff(id, name, option, release_id)
VALUES (1, 'SQL', 'ALPHA', 1),
       (2, 'Java', 'ALPHA', 1),
       (3, 'Python', 'ALPHA', 2),
       (4, 'Ruby', 'ALPHA', 2),
       (5, 'Ada95', 'BETA', 2);


