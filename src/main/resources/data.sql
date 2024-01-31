insert into rol(nombre_rol, descripcion_rol) values ('ADMIN', 'Admin');
insert into rol(nombre_rol, descripcion_rol) values ('CLIENTE', 'Cliente');

insert into usuario(username, password, id_rol, estado) values('harry', '123', 1,'A');

insert into moneda(nombre_moneda, nombre_divisa, tipo_cambio) values ('Sol','PEN', 1);
insert into moneda(nombre_moneda, nombre_divisa, tipo_cambio) values ('Dolar','USD', 3.81);