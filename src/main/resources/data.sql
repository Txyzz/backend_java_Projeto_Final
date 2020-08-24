insert into categoria (id, nome, descricao) values
	(1, 'livros', 'livros digitais e fisicos'), 
	(2, 'brinquedos', 'brinquedos legais'), 
	(3, 'acessorios ', 'acessorios uteis'),
	(4, 'televisores', 'tvs para ver filmes');

insert into funcionario (id, nome, cpf) values
	(1, 'Cleiton', '123.123.123-00'),
	(2, 'Maria', '321.321.321-99');

insert into cliente (id, nome, telefone, usuario, email, cpf, data_nascimento, cep, cidade, bairro, complemento, numero, uf, rua) values
	(1,'Roberto', '24992651830', 'robertinho', 'roberto@hotmail.com', '141.141.141-44',parsedatetime('2020-08-10', 'yyyy-mm-dd'), '25619041','São Paulo', 'zona leste','casa verde','123','SP','Marginal Tiete'),
	(2,'José', '24992182017', 'josuetaa', 'josue@hotmail.com', '432.432.432-32',parsedatetime('2020-08-10', 'yyyy-mm-dd'), '25619302','Rio De Janeiro', 'Recreio','casa amarela','321','RJ','Rua Coelho Dias');


insert into produto (id, nome, categoria_id, descricao, data_fabricacao, quantidade_estoque, valor_unitario) values

	(1,'Narnia', 1, 'Livro sobre um mundo magico', TO_DATE('12-01-2019','dd-MM-yyyy'), '10', '30');

insert into produto_funcionario (produto_id, funcionario_id) values
	(1,1);

insert into pedido (id, data_pedido, cliente_id) values
    (1,parsedatetime('12-01-2019','dd-MM-yyyy'), 1),
    (2,parsedatetime('12-01-2019','dd-MM-yyyy'), 2);
    
insert into pedido_item (id, pedido_id, produto_id, quantidade) values 
	(1,1,1,3),
	(2,2,1,3);


