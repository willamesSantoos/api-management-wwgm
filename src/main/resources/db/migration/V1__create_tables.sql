CREATE TABLE product (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    value DOUBLE PRECISION NOT NULL,
    quantity INT NOT NULL
);

CREATE TABLE "user" (
    id SERIAL PRIMARY KEY,
    "user" VARCHAR(255) NOT NULL,
    password DOUBLE PRECISION NOT NULL,
    is_work BOOLEAN NOT NULL
);