insert into urbana.tipo_cartao(id, tipo) values (1, 'COMUM');
insert into urbana.tipo_cartao(id, tipo) values (2, 'ESTUDANTE');
insert into urbana.tipo_cartao(id, tipo) values (3, 'TRABALHADOR');

INSERT INTO urbana.usuario (id, nome, email, senha) VALUES (1, 'Lucas Batista', 'lucas@localhost.com', 'pass@123');
INSERT INTO urbana.usuario (id, nome, email, senha) VALUES (2, 'Roberto Cajueiro', 'roberto@localhost.com', 'pass@123');
INSERT INTO urbana.usuario (id, nome, email, senha) VALUES (3, 'Danielli Bezerra', 'danielli@localhost.com', 'pass@123');
INSERT INTO urbana.usuario (id, nome, email, senha) VALUES (4, 'Danielli Bezerra', 'danielli@localhost.com', 'pass@123');

INSERT INTO urbana.cartao (id, numero_cartao, status, id_usuario, tipo_cartao) VALUES ('1', 1111777444, 1, 1, 'ESTUDANTE');
INSERT INTO urbana.cartao (id, numero_cartao, status, id_usuario, tipo_cartao) VALUES ('2', 111222333, 0, 2, 'TRABALHADOR');
INSERT INTO urbana.cartao (id, numero_cartao, status, id_usuario, tipo_cartao) VALUES ('3', 222555999, 0, 3, 'COMUM')
INSERT INTO urbana.cartao (id, numero_cartao, status, id_usuario, tipo_cartao) VALUES ('4', 333444777, 0, 4, 'ESTUDANTE')

