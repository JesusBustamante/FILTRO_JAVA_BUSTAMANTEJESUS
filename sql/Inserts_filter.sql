-- INSERTS

INSERT INTO ninja (name, ranges, village) VALUES
('Hakimoto', 'Jonin', 'Konohagakure'),
('Naruto', 'Genin', 'Kusagakure'),
('Shinobi', 'Anbu', 'Shimogakure'),
('Nokizaru', 'Kage', 'Tanigakure'),
('Ukami', 'Chunin', 'Ishigakure');

INSERT INTO mision (description, ranges, reward) VALUES 
('Transportation of secret documents', 'S', 1000000.00),
('Individual private guard', 'C', 50000.00),
('Request from other countries to join the war', 'A', 800000.00),
('Search for missing pets', 'D', 10000),
('Espionage work', 'B', 150000.00);

INSERT INTO ninja_mision (id_ninja, id_mision, start_date, end_date) VALUES
(1, 2, '2025-01-01', NULL),
(2, 3, '2025-01-15', '2025-01-25'),
(3, 1, '2025-02-27', NULL),
(4, 5, '2025-03-14', '2025-03-16'),
(5, 4, '2025-04-01', '2025-04-02');

INSERT INTO skill (name, description) VALUES
('Summoning Jutsu', 'Invocation of gods of the afterlife'),
('Sensor', 'Chakra detection'),
('Transformation of nature', 'Manipulation of the elements of nature'),
('Rasengan', 'Power ball ejection'),
('Shadow clone', 'Clone shadows for power enhancement');

INSERT INTO ninja_skill (id_ninja, id_skill) VALUES
(1, 1),
(2, 2),
(2, 5),
(3, 3),
(4, 3),
(5, 4);