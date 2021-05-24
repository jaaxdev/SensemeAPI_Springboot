DROP TABLE IF EXISTS recordatorios;

CREATE TABLE recordatorios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    texto VARCHAR(400) NOT NULL,
    fecha DATE NOT NULL
);