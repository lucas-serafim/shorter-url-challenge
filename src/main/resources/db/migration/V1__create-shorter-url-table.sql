
CREATE TABLE shorter_url (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    short_url TEXT NOT NULL,
    original_url TEXT NOT NULL,
    clicks INTEGER
);