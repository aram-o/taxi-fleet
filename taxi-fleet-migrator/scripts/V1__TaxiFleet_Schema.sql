CREATE TABLE taxi
(
    id                     SERIAL PRIMARY KEY NOT NULL,
    name                   VARCHAR(1024),
    state                  VARCHAR(50),
    location               VARCHAR(512),
    create_date            TIMESTAMP,
    update_date            TIMESTAMP
);

CREATE TABLE booking
(
    id                     SERIAL PRIMARY KEY NOT NULL,
    taxi_id                VARCHAR(1024),
    passenger_email        VARCHAR(50),
    create_date            TIMESTAMP,
    update_date            TIMESTAMP
);

