
create database empresadb;
use empresadb;
create table curso(
	id_curso integer auto_increment,
    descripcion varchar (50),
    precio decimal,
    constraint pk_id_curso primary key (id_curso)
    );
    
create table forma_de_pago (
	id_forma_de_pago integer auto_increment,
    descripcion varchar (50),
    recargo varchar (10),
    constraint pk_id_forma_de_pago primary key (id_forma_de_pago)
    );
    
create table inscripcion (
	id_insc integer auto_increment,
    nombre varchar (30),
    clave varchar (200),
    rol varchar(10),
    celular varchar(10),
    id_curso integer,
    id_forma_de_pago integer,
    constraint pk_id_insc primary key (id_insc),
    constraint fk_table_curso foreign key (id_curso) references curso (id_curso) on delete cascade,
    constraint fk_table_forma_de_pago foreign key (id_forma_de_pago) references  forma_de_pago (id_forma_de_pago) on delete cascade
    );
    
insert into curso (descripcion, precio)
values ("programacion Java", 200000);
insert into curso (descripcion, precio)
values ("programacion Python", 250000);
insert into curso (descripcion, precio)
values ("programacion Node", 300000);
insert into curso (descripcion, precio)
values ("programacion C+", 350000);
insert into curso (descripcion, precio)
values ("programacion NET", 400000);
insert into curso (descripcion, precio)
values ("programacion Php", 450000);
insert into curso (descripcion, precio)
values ("programacion Javascript", 500000);
insert into curso (descripcion, precio)
values ("programacion R", 550000);
insert into curso (descripcion, precio)
values ("programacion Matlab", 600000);
insert into curso (descripcion, precio)
values ("programacion Swift", 750000);

insert into forma_de_pago(id_forma_de_pago, descripcion, recargo)
values(2001, "Credito", "Si");
insert into forma_de_pago(id_forma_de_pago, descripcion, recargo)
values(2002, "Debito", "Si");
insert into forma_de_pago(id_forma_de_pago, descripcion, recargo)
values(2003, "PayPal", "Si");

insert into inscripcion(nombre, clave, rol, celular, id_curso, id_forma_de_pago)
values("Quentin Tarantino", "pass1", "ADMIN", "912390014", 2, 2001);
insert into inscripcion(nombre, clave, rol, celular, id_curso, id_forma_de_pago)
values("Margot Robbie", "pass2", "USER", "96456351", 2, 2002);
insert into inscripcion(nombre, clave, rol, celular, id_curso, id_forma_de_pago)
values("Uma Thurman", "pass3", "USER", "97819851", 3, 2002);
insert into inscripcion(nombre, clave, rol, celular, id_curso, id_forma_de_pago)
values("Samuel L. Jackson", "pass4", "USER", "818514684", 4, 2002);
insert into inscripcion(nombre, clave, rol, celular, id_curso, id_forma_de_pago)
values("Jammie Foxx", "pass5", "USER", "985468234", 5, 2001);
insert into inscripcion(nombre, clave, rol, celular, id_curso, id_forma_de_pago)
values("Leonardo Dicaprio", "pass6", "USER", "854651241", 6, 2002);

select * from curso c inner join inscripcion i on c.id_curso =i.id_curso where c.id_curso =5;

select * from curso;
select * from forma_de_pago;
select * from inscripcion;

    