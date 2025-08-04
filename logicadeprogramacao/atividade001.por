programa {
  funcao inicio() {
    // declaração e variavel
    cadeia nome
    cadeia genero
    inteiro idade 

    // entrada de dados 
    escreva("informe seu nome: ")
    leia(nome)
    escreva("informe sua idade")
    leia(idade )
    escreva("informe seu genero")
    leia(genero)
    se(genero=="f")
    {
      se(idade >= 62) escreva("seu nome é:", nome, "tem idade:", idade, "\npode aposentar")
      senao escreva("seu nome é:", nome, "tem idade: ", idade,"\nAinda não pode aposentar")
    }
    senao se(genero == "M"){
      se (idade >= 65) escreva("seu nome é: ", nome,"tem idade", idade, "\npode aposentar")
      senao escreva("seu nome é: ", nome,"tem idade: ", idade,"\nainda nao pode se aponsetar")
    }
    senao escreva("genero invalido!")

  }
}
