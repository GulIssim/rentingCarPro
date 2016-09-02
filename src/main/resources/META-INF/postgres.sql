-- Table: customer

-- DROP TABLE customer;

CREATE TABLE customer
(
  cust_id serial NOT NULL,
  lastname text,
  firstname text,
  address text,
  cust_iin bigint,
  CONSTRAINT cust_id_pk PRIMARY KEY (cust_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE customer
  OWNER TO postgres;
