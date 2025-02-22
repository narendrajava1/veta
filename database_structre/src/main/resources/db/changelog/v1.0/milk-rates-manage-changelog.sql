--liquibase formatted sql
--changeset milk-rates-manage_Narendra Kumar Kolli:1
create table milkrate (
        id bigint not null auto_increment,
        milk_category varchar(255),
        price bigint,
        status BIT,
        primary key (id)
    ) engine=InnoDB;
