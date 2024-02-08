create table if not exists customer
(
    id        bigserial not null primary key,
    firstname varchar   not null,
    lastname  varchar   not null
);