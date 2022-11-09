--insert into urbana.tipo_cartao(id, tipo) values (1, 'COMUM');
--insert into urbana.tipo_cartao(id, tipo) values (2, 'ESTUDANTE');
--insert into urbana.tipo_cartao(id, tipo) values (3, 'TRABALHADOR');

INSERT INTO urbana.usuario (nome, email, senha) VALUES ('Lucas Batista', 'lucas@localhost.com', 'pass@123');
INSERT INTO urbana.usuario (nome, email, senha) VALUES ('Roberto Cajueiro', 'roberto@localhost.com', 'pass@123');
INSERT INTO urbana.usuario (nome, email, senha) VALUES ('Danielli Bezerra', 'danielli@localhost.com', 'pass@123');

INSERT INTO urbana.cartao (numero_cartao, status, tipo_cartao, id_usuario) VALUES (1111777444, 1, 1, 1);
INSERT INTO urbana.cartao (numero_cartao, status, tipo_cartao, id_usuario) VALUES (111222333, 1, 2, 2);
INSERT INTO urbana.cartao (numero_cartao, status, tipo_cartao, id_usuario) VALUES (222555999, 0, 0, 3);
INSERT INTO urbana.cartao (numero_cartao, status, tipo_cartao, id_usuario) VALUES (333444777, 1, 1, 3);
--



