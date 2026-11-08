-- Crear la base de datos
CREATE DATABASE empresa;
USE empresa;

-- Crear tabla de áreas
CREATE TABLE areas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

-- Crear tabla de personal
CREATE TABLE personal (
    dni INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    area INT NOT NULL,
    FOREIGN KEY (area) REFERENCES areas(id)
);

-- Insertar datos de ejemplo en áreas
INSERT INTO areas (id, nombre) VALUES
(1, 'Recursos Humanos'),
(2, 'Sistemas'),
(3, 'Contabilidad'),
(4, 'Administración'),
(5, 'Atención al Público'),
(6, 'Registro Civil'),
(7, 'Industria y Comercio');

-- Insertar datos de ejemplo en personal
INSERT INTO personal (dni, nombre, apellido, area) VALUES
(25789456, 'Juan', 'Pérez', 2),
(32456789, 'María', 'González', 1),
(28901234, 'Carlos', 'Rodríguez', 3),
(35678901, 'Ana', 'Martínez', 4),
(30123456, 'Luis', 'Fernández', 2),
(27654321, 'Laura', 'López', 5),
(33987654, 'Pedro', 'Sánchez', 6),
(29456123, 'Sofía', 'Ramírez', 1),
(31789012, 'Diego', 'Torres', 7),
(26543210, 'Valentina', 'Flores', 3);

-- Consulta para ver el personal con sus áreas
SELECT 
    p.dni,
    p.nombre,
    p.apellido,
    a.nombre AS area
FROM personal p
INNER JOIN areas a ON p.area = a.id
ORDER BY p.apellido;