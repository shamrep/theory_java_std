create table tag (
  id bigserial,
  name varchar(255),
  registration_date date,
  inf jsonb
);

drop table tag;