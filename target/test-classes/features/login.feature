#language: pt
@funcionais
Funcionalidade: Login

  Cenário: Realizar login valido
    Dado que estou na tela de login
    E possuo um usuario cadastrado
    Quando efetuo o login corretamente
    Então devo visualizar a tela my account

  Cenário: Realizar login invalido
    Dado que estou na tela de login
    Quando efetuo o login com dados incorretos
    Então devo visualizar a mensagem informando que existe erro
    E devo visualizar a mensagem de autenticacao invalida

  Esquema do Cenário: Realizar login sem preencher os dados
    Dado que estou na tela de login
    Quando efetuo o login informando <login> e <senha>
    Então devo visualizar a mensagem informando que existe erro
    E devo visualizar a <mensagem> de obrigatoriedade de preenchimento

    Exemplos: 
      | login              | senha    | mensagem                     |
      | ""                 | "123456" | "An email address required." |
      | "emnail@email.com" | ""       | "Password is required."      |
      | ""                 | ""       | "An email address required." |