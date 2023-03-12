CREATE TABLE mmUsuario (
	mmUsuario TEXT,
	mmNombre TEXT,
	mmClave TEXT
, mmFechaCreacion TEXT);


CREATE TABLE mmCoordenadas (
	mmCapacidadBelica INTEGER,
	mmGeoLocalizacion TEXT,
	mmDetalleDelArsenal TEXT,
	mmFechaIngreso TEXT
);

INSERT INTO mmUsuario
(mmUsuario, mmNombre, mmClave, mmFechaCreacion)
VALUES('profesor', 'Profesor', 'MTIzNA==', '12/03/2023');
INSERT INTO mmUsuario
(mmUsuario, mmNombre, mmClave, mmFechaCreacion)
VALUES('mercedez.martinez@epn.edu.ec', 'Mercedez', 'MTc1Mjg2NDM3OQ==', '12/03/2023');
INSERT INTO mmUsuario
(mmUsuario, mmNombre, mmClave, mmFechaCreacion)
VALUES('alumno2', 'Alumno2', 'MTIzNA==', '12/03/2023');



INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(9, 'GPS9', 'aaabbcd', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(7, 'GPS7', 'aaabbct', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(3, 'GPS3', 'bcd', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(4, 'GPS4', 'acd', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(6, 'GPS6', 'act', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(8, 'GPS8', 'abbccdt', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(2, 'GPS2', 'ac', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(5, 'GPS5', 'bct', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(7, 'GPS7', 'aaabbct', '12/03/2023');
INSERT INTO mmCoordenadas
(mmCapacidadBelica, mmGeoLocalizacion, mmDetalleDelArsenal, mmFechaIngreso)
VALUES(1, 'GPS1', 'bc', '12/03/2023');
