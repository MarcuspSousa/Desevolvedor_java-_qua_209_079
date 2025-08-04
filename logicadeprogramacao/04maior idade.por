programa {
  funcao inicio() {
    //decleração de variveis 
    cadeia nome 
    inteiro idade 

    // entrada de dados 
    escreva("informe seu nome: ")
    leia(nome)
    escreva("informe sua idade: ")
    leia(idade)

    // estrutura de decisão
     se (idade >= 18)
     {
      escreva (nome, "é maior de idade.")
     }
     senao
     {
      escreva(nome,"é menor de idade.")
     }
  }
}
