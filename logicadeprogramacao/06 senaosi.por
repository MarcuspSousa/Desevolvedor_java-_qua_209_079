programa {
  funcao inicio() {
    // declaração de variavel 
    cadeia nome 
    real nota

    // entrada de dados 
    escreva("informe seu nome: ")
    leia(nome)
    leia(nome)
    escreva("informe sua nota: ")
    leia(nota)

    // verificação se a nota e valida
    se (nota >= 0 e nota <= 10)
  {
    se(nota >= 7) escreva(nome, "esta aprovado. ")
    senao se (nota >= 5) escreva(nome, " esta de recuperação. ")
    senao escreva(nome, " esta reprovado. ")
    }
  senao
  {
    escreva("nota invalida. ")
  }
  }
}
