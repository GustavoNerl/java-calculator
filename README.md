##🎬 Banco de Dados - Sistema de Locadora de Filmes
Este projeto representa o modelo de banco de dados de uma locadora de filmes, com foco em organização, integridade dos dados e fácil manutenção. O banco segue uma abordagem relacional e é implementado em MySQL.

##📐 Estrutura Geral
O banco de dados é composto por:

Tabelas Dimensionais: armazenam os dados mestres (clientes, filmes, funcionários, etc.).

Tabela de Fato: registra os eventos de locação realizados.

##🧾 Tabelas e Descrições
🔹 D_genero
Tabela que armazena os gêneros disponíveis dos filmes.

ID: Identificador único do gênero (chave primária).

DESCRICAO: Nome do gênero (ex: Ação, Drama, Comédia).

##🔹 D_midia
Registra os tipos de mídia em que os filmes são disponibilizados.

ID: Identificador único da mídia (chave primária).

DESCRICAO: Tipo de mídia (ex: DVD, Blu-Ray, Digital).

##🔹 D_filmes
Tabela com os filmes cadastrados.

ID: Identificador único do filme.

DESCRICAO: Nome ou título do filme.

GENERO: Chave estrangeira para D_genero.

MIDIA: Chave estrangeira para D_midia.

##🔹 D_cliente
Contém os dados cadastrais dos clientes da locadora.

CPF: Identificador único do cliente (chave primária).

NOME: Nome completo.

TELEFONE: Número de telefone.

ENDERECO: Endereço residencial.

EMAIL: Endereço de e-mail.

DATA_NASC: Data de nascimento.

##🔹 D_funcionario
Cadastro dos funcionários responsáveis pelos atendimentos e locações.

ID: Identificador único do funcionário.

NOME: Nome completo.

CARGO: Cargo ocupado (ex: atendente, gerente).

DATA_NASC: Data de nascimento.

##🔸 F_locacao
Tabela de fato que registra as locações de filmes.

ID: Identificador da locação.

ID_FILME: Filme locado (referência a D_filmes).

ID_CLIENTE: Cliente que realizou a locação (referência a D_cliente).

ID_FUNCIONARIO: Funcionário responsável pela locação (referência a D_funcionario).

DATA_LOCACAO: Data em que o filme foi locado.

DATA_DEVOLUCAO: Data da devolução prevista ou realizada.

VALOR: Valor cobrado pela locação (formato decimal).

##🔗 Relacionamentos
Um filme pertence a um gênero e a uma mídia.

Uma locação envolve um cliente, um funcionário e um filme.

Todos os relacionamentos são garantidos por chaves estrangeiras, mantendo a integridade referencial.

##💡 Objetivo
Este banco de dados foi criado com o propósito de:

Automatizar o controle de locações.

Gerenciar de forma eficiente os dados de clientes, filmes e funcionários.

Garantir rastreabilidade e integridade em todas as operações.
