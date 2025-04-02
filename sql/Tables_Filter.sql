-- TABLES

CREATE TABLE ninja (
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL,
    ranges ENUM('Genin', 'Chunin', 'Jonin', 'Kage', 'Anbu') NOT NULL,
    village VARCHAR(255)
);

CREATE TABLE mision (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    description VARCHAR(255),
    ranges ENUM('S', 'A', 'B', 'C', 'D') NOT NULL,
    reward DECIMAL NOT NULL
);

CREATE TABLE ninja_mision (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_ninja INT NOT NULL,
    id_mision INT NOT NULL,
    start_date DATE,
    end_date DATE NULL,
    FOREIGN KEY (id_ninja) REFERENCES ninja (id),
    FOREIGN KEY (id_mision) REFERENCES mision (id)
);

CREATE TABLE skill (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(50),
    description VARCHAR(255)
);

CREATE TABLE ninja_skill (
	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_ninja INT NOT NULL,
    id_skill INT NOT NULL,
    FOREIGN KEY (id_ninja) REFERENCES ninja (id),
    FOREIGN KEY (id_skill) REFERENCES skill (id)
);