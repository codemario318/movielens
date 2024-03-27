CREATE TABLE IF NOT EXISTS movies (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL UNIQUE,
    genres VARCHAR(255),
    rating_count INT NOT NULL,
    rating_total BIGINT NOT NULL
);

CREATE INDEX IF NOT EXISTS ux_title ON movies (title);