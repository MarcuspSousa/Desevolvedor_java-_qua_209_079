programa {
  funcao inicio() {
    //declaração de variavel 
    cadeia nome, genero
    inteiro idade

    // entrada dedados
    escreva("informe o nome: ")
    leia(nome)
    escreva("informe sua idade: ")
    leia(idade)
    escreva("informe seu genero: ")
    leia(genero)

   //verefica a idade de genero
    se(idade >= 65 e genero == "masculino" ou idade >= 62 e genero == "feminino") 
    escreva(nome, "aposentadoria autorizada.")
    senao escreva(nome, "aposentadoria não autorizada.")
  }
}
