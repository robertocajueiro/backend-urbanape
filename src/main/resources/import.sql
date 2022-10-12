insert into urbana.tipo_cartao(id, tipo) values (1, 'COMUM');
insert into urbana.tipo_cartao(id, tipo) values (2, 'ESTUDANTE');
insert into urbana.tipo_cartao(id, tipo) values (3, 'TRABALHADOR');

INSERT INTO urbana.cartao (numero_cartao, status, tipo_cartao) VALUES (1111777444, 1, 'ESTUDANTE');
INSERT INTO urbana.cartao (numero_cartao, status, tipo_cartao) VALUES (111222333, 0, 'TRABALHADOR');
INSERT INTO urbana.cartao (numero_cartao, status, tipo_cartao) VALUES (222555999, 0, 'COMUM');
INSERT INTO urbana.cartao (numero_cartao, status, tipo_cartao) VALUES (333444777, 0, 'ESTUDANTE');

INSERT INTO urbana.usuario (nome, email, senha, id_cartao) VALUES ('Lucas Batista', 'lucas@localhost.com', 'pass@123', '1');
INSERT INTO urbana.usuario (nome, email, senha, id_cartao) VALUES ('Roberto Cajueiro', 'roberto@localhost.com', 'pass@123', '2');
INSERT INTO urbana.usuario (nome, email, senha, id_cartao) VALUES ('Danielli Bezerra', 'danielli@localhost.com', 'pass@123', '3');
INSERT INTO urbana.usuario (nome, email, senha, id_cartao) VALUES ('Danielli Bezerra', 'danielli@localhost.com', 'pass@123', '4');



