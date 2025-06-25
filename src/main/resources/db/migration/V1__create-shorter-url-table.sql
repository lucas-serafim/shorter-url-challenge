
CREATE TABLE shorterUrl (
    short_code TEXT PRIMARY KEY UNIQUE NOT NULL,
    short_url TEXT NOT NULL,
    original_url TEXT NOT NULL,
    clicks INTEGER
);