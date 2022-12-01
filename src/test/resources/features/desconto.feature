#language: pt

  Funcionalidade: Receber Desconto da Qazando
    Eu como usuário da qazando
    quero receber um cupom de desconto
    para comprar um curso com valor reduzido

    Cenário: Visualizar código de desconto
      Dado que estou no site da Qazando
      Quando eu preencho meu e-mail
      E aperto a tecla Enter
      Então eu vejo o código de desconto
