alter table medicos add ativo SMALLINT not null DEFAULT(1);
alter table pacientes add ativo SMALLINT not null DEFAULT(1);