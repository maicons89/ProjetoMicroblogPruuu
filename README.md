# Projeto Microblog Pruu

## Contextualização:
Repositório para projeto de clone do Twitter em Java.
Sistema capaz de armazenar mensagens de texto no formato de um microblog (o Pombo)

## Regras:

<lu>
<li>1- Requisitos do Pombo: 1.1 Um usuário geral (nome, email e CPF) pode enviar várias mensagens (pruus).
1.2 Um usuário administrador (com todos os dados do usuário geral) pode analisar pruus e bloqueá-los 1.2 Cada pruu contém:</li>

<li>ID: Atributo inteiro para representar unicamente um determinado pruu.</li>

<li>Estratégias para gerar o id (ESCOLHER UMA SÓ): a- Gerar de forma randômica ao construir um novo objeto pruu.
Exemplo: https://www.educative.io/answers/how-to-generate-random-numbers-in-java 
b- Receber o id como parâmetro no construtor, e controlar o valor atual (global) na classe PrincipalPombo; c- Representar o valor atual do último id gerado como um atributo estático na classe Pruu.</li>

<li>Texto: com no máximo 300 caracteres (considerando espaços) e no mínimo 1 (desconsiderando espaços).
Caso o tamanho do texto seja inválido, não deixe criar o pruu (implemente essa regra na classe PrincipalPombo;</li>

<li>Data de criação (use java.util.Date).</li>

<li>Quantidade de likes</li>

<li>Uma indicação se ele está bloqueado ou não</li>
  
<li>Mostre no toString(): id, texto (caso não bloqueado), quantidade de likes 1.4 Cada usuário pode enviar vários pruus 1.5 Cada usuário pode ver todos os pruus de:</li>

<li>Qualquer usuário (mostrar todos pruus).</li>

<li>Um usuário selecionado (pruus apenas desse usuário) 1.6 Ao listar os pruus, o sistema deve permitir que o usuário atual dê like.</li>

<li>2- Desenvolva: 2.1 as classes de entidades para modelar adequadamente o problema proposto (no pacote entidade) 2.2 uma classe PrincipalPombo (no pacote principal) e implemente no método main() as seguintes operações:</li>

<li>Cadastrar usuários (pelo menos 3, sendo um deles administrador).</li>

<li>Cada usuário deve enviar pelo menos 2 pruus</li>

<li>Mostrar todos os pruus de todos os usuários</li>

<li>Mostrar todos os pruus de um determinado usuário</li>

<li>Dar like em um determinado pruu</li>

<li>Administrador bloquear um determinado pruu</li>

<li>visualizar o pruu bloqueado (com usuário comum) dica: crie um método estático na classe PrincipalPombo para cada item solicitado e chame todos eles no main().</li>

<li>Entrega:</li>

<li>Enviar o link do projeto versionado no git para vilmarcesarpereira@gmail.com</li>

<li>Assunto [POO-Entra21 2022] NomeAluno1_NomeAluno2</li>

<li>Prazo: entregar até 31/07/2022 23:59</li>

</lu>