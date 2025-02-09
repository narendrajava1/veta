--liquibase formatted sql
--changeset Narendra Kumar Kolli:1
create table cattle (
        id bigint not null auto_increment,
        tag_number varchar(255),
        breed varchar(255),
        health_status varchar(255),
        last_vaccination_date date,
        birth_date date,
        primary key (id)
    ) engine=InnoDB;
