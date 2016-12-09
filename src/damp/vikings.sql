USE vikings;


CREATE TABLE IF NOT EXISTS cliente(

  idclient INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(40),
  cpf INT (14) UNIQUE,
  cep VARCHAR(9),
  cidade VARCHAR(50),
  uf VARCHAR(2),
  endclient VARCHAR(100),
  foneFixo VARCHAR(14),
  foneCelular VARCHAR(14),
  emailClient VARCHAR(100),
  PRIMARY KEY (idclient)

)DEFAULT  CHARACTER SET = utf8;

SELECT * FROM cliente;

CREATE TABLE IF NOT EXISTS tbusuario(

  iduser INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(50) not NULL ,
  pessoaPC VARCHAR(50)NOT NULL ,
  sexo VARCHAR(5),
  cep VARCHAR(9),
  uf VARCHAR(2),
  municipio VARCHAR(50),
  bairro VARCHAR(50),
  logradouro VARCHAR(50),
  numero VARCHAR(10),
  complemento VARCHAR(50),
  cpf VARCHAR(14),
  rg VARCHAR(20),
  email VARCHAR(100),
  funcao VARCHAR(50),
  PRIMARY KEY (iduser)

)DEFAULT CHARSET = utf8;

SELECT * FROM tbusuario;



