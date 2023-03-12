/*
Copyright (C) 2023, TonguitaXd
------------------------------
Creacion de la tabla Localidad con datos
12.marzo.2023
Version 1.0
*/

/*
Numero de cedula Anthony Alejandro Morales Vargas: 1755366877
Para poblar los datos de las coordenadas ucranianas, cada fila corresponde a un número de cedula en forma inversa
Entonces: 7786635571
*/

    DROP TABLE IF EXISTS COORDENADAS;

    CREATE TABLE IF NOT EXISTS COORDENADAS
    (
    
    AM_CAPACIDAD       INTEGER NUll,
    AM_GEO             VARCHAR(20) NOT NULL,
    AM_ARSENAL         VARCHAR(20) NOT NULL,
    AM_FECHA_HACK      VARCHAR(20) DEFAULT(datetime('now'))
    );

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (7, 'GPS7', 'aaabbct');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (7, 'GPS7', 'aaabbct');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (8, 'GPS8', 'abbccdt');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (6, 'GPS6', 'act');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (6, 'GPS6', 'act');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (3, 'GPS3', 'bcd');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (5, 'GPS5', 'bct');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (5, 'GPS5', 'bct');
    
    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (7, 'GPS7', 'aaabbct');

    INSERT INTO COORDENADAS (AM_CAPACIDAD, AM_GEO, AM_ARSENAL)
                    VALUES  (1, 'GPS1', 'bc');

SELECT * FROM COORDENADAS;


 DROP TABLE IF EXISTS USUARIOS;

    CREATE TABLE IF NOT EXISTS USUARIOS
    (
     AM_ID_USUARIOS                 INTEGER NULL
    ,AM_USUARIOS                    VARCHAR(20) NOT NULL
    ,AM_CONTRASENA_ENCRIPTADA       VARCHAR(20) NOT NULL
    );
-----------------------------------------------------------------------------------------
    INSERT INTO USUARIOS    (AM_ID_USUARIOS,AM_USUARIOS, AM_CONTRASENA_ENCRIPTADA)
                    VALUES  (1,'profe', '81dc9bdb52d04dc20036dbd8313ed055');
    INSERT INTO USUARIOS    (AM_ID_USUARIOS,AM_USUARIOS, AM_CONTRASENA_ENCRIPTADA)
                    VALUES  (1,'anthony.morales03@epn.edu.ec', '4e40b6c496bd93172605e33a40902966'); 
    INSERT INTO USUARIOS    (AM_ID_USUARIOS,AM_USUARIOS, AM_CONTRASENA_ENCRIPTADA)
                    VALUES  (1,'estudiante.politecnico@epn.edu.ec', 'daf456a7ca6e8a951571fce068f80ffc'); 
    
-----------------------------------------------------------------------------------------
SELECT * FROM USUARIOS;





