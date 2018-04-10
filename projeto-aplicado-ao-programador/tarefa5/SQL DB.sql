create database bancohoras;

use bancohoras;

create table aluno (
	id bigint auto_increment,
	ra char(11) not null,
	nome varchar(35) not null,
	primary key (id)
);

insert into aluno values (null, '02201401345', 'João Silva');
insert into aluno values (null, '02201401348', 'Pedro Alencastro');
insert into aluno values (null, '02201401349', 'Joana Moura');