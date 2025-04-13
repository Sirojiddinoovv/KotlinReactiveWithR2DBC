create table public.customer (
                                 id SERIAL PRIMARY KEY,
                                 username VARCHAR (50) UNIQUE NOT NULL,
                                 created_at TIMESTAMP NOT NULL
);
