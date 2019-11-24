DROP TABLE IF EXISTS counters;
DROP TABLE IF EXISTS energy_consumptions;
 
CREATE TABLE counters (
  id BIGINT  AUTO_INCREMENT  PRIMARY KEY,
  village_name VARCHAR(250) NOT NULL
);

CREATE TABLE energy_consumptions (
  id BIGINT  AUTO_INCREMENT  PRIMARY KEY,
  id_counter INT NOT NULL,
  amount DOUBLE NOT NULL,
  date_time TIMESTAMP NOT NULL,
  foreign key (id_counter) references counters(id)
);

INSERT INTO counters(village_name) values ('Village Test');
INSERT INTO counters(village_name) values ('Village Test 2');
INSERT INTO counters(village_name) values ('Village Test 3');
INSERT INTO counters(village_name) values ('Village Test 4');
INSERT INTO counters(village_name) values ('Village Test 5');
INSERT INTO counters(village_name) values ('Village Test 6');
INSERT INTO counters(village_name) values ('Village Test 7');

INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 200.00, dateadd( hour, -1, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 1257.45, dateadd( hour, -2, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 987.65, dateadd( hour, -3, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (2, 2457.54, dateadd( hour, -5, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -6, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -7, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (2, 2457.54, dateadd( hour, -8, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -9, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -10, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (2, 2457.54, dateadd( hour, -11, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -12, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -13, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (2, 2457.54, dateadd( hour, -14, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -15, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -17, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (2, 2457.54, dateadd( hour, -18, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -19, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (2, 2457.54, dateadd( hour, -20, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -21, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -22, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (3, 2457.54, dateadd( hour, -23, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -24, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (3, 2457.54, dateadd( hour, -25, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -26, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (3, 2457.54, dateadd( hour, -27, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (1, 2457.54, dateadd( hour, -28, CURRENT_TIMESTAMP()));
INSERT INTO energy_consumptions(id_counter, amount, date_time) values (4, 2457.54, dateadd( hour, -29, CURRENT_TIMESTAMP()));


