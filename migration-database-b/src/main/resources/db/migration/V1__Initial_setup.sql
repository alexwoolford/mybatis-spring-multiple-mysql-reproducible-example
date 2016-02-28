CREATE TABLE app_props
(
  attribute VARCHAR(255),
  value VARCHAR(255),
  UNIQUE KEY (attribute)
);

INSERT INTO app_props (attribute, value) VALUES ('active_set', 'b');