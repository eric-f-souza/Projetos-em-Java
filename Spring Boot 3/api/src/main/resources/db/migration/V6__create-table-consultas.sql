create table consultas(

    id SERIAL PRIMARY KEY,
    medico_id bigint not null ,
    paciente_id bigint not null ,
    dataHora timestamp,
    foreign key(medico_id) references medicos(id),
    foreign key(paciente_id) references pacientes(id)

);