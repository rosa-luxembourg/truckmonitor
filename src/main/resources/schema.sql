drop table if exists position;
drop table if exists truck;

CREATE TABLE truck(
  id SERIAL PRIMARY KEY,
  license_plate varchar(50) not null
);

CREATE TABLE position (
  id SERIAL PRIMARY KEY,
  location point not null,
  created timestamp without time zone,
  truck_id BIGINT not null,
  CONSTRAINT fk_position_truck FOREIGN KEY (truck_id) REFERENCES truck(id) ON DELETE NO ACTION ON UPDATE NO ACTION
);