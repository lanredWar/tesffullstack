CREATE DATABASE bd_bernal;
USE bd_bernal;

-- Tabla person
CREATE TABLE person (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    fechaNacimiento DATE NULL,
    puesto VARCHAR(50) NOT NULL,
    sueldo DECIMAL(10, 2) NOT NULL
);

-- Usuario "conexion"
CREATE USER 'conexion'@'localhost' IDENTIFIED BY '1234567';
GRANT ALL PRIVILEGES ON bd_bernal.* TO 'conexion'@'localhost';
FLUSH PRIVILEGES;