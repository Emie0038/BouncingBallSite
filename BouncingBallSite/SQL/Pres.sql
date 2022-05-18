CREATE DATABASE IF NOT EXISTS images;

USE images;

CREATE TABLE images
(id int AUTO_INCREMENT PRIMARY KEY , name VARCHAR(300), url VARCHAR(3000));

INSERT INTO images(name, url) VALUES ('ball_class', 'https://imgur.com/VrznYty');
INSERT INTO images VALUES (id, 'ball_constructor', 'https://imgur.com/oyk6Fug');
INSERT INTO  images VALUES(id, 'ball_created', 'https://imgur.com/jgLNgAI');
INSERT INTO images VALUES (id, 'ball_initialize', 'https://imgur.com/IvDItQO');
INSERT INTO images VALUES (id, 'ball_paintComp', 'https://imgur.com/1HFrAZm');
INSERT INTO images VALUES(id, 'ball_panel', 'https://imgur.com/OWSNQed');
INSERT INTO images VALUES(id, 'ball_position', 'https://imgur.com/WS5hRHR');