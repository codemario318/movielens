CREATE TABLE IF NOT EXISTS movies (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL UNIQUE,
    genres VARCHAR(255) NOT NULL,
    rating_count INT NOT NULL,
    rating_total BIGINT NOT NULL
);

CREATE INDEX IF NOT EXISTS ux_title ON movies (title);
CREATE INDEX IF NOT EXISTS ix_rating_count ON movies (rating_count);
CREATE INDEX IF NOT EXISTS ix_rating_avg ON movies ((rating_total / NULLIF(rating_count, 0)));