programa {
  funcao inicio() {
  // declaração de variaveis
  real x, y, result
  inteiro opcao

  //loop faca enquanto
  faca
  {
    // menu
    escreva("\n1 - soma\n")
    escreva("2 - subtração\n")
    escreva("3 - multiplicação\n")
    escreva("4 - divisão\n")
    escreva("5 - sair do programa")
    leia(opcao)

    //verifica se o usario deseja sair ou não
    se(opcao >= 1 e opcao <= 4)
    {
      escreva("informe o calor de x: ")
      leia (x)
      escreva("informe o valor de y: ")
      leia(y)
    }

    //verificar a opção escolhida
    escolha(opcao)
    {
      caso 1:
      result = x+y
      escreva("resultado:", result)
      pare
        caso 2:
      result = x-y
      escreva("resultado:", result)
      pare
        caso 3:
      result = x*y
      escreva("resultado:", result)
        caso 4:
      result = x/y
      escreva("resultado:", result)
      pare
      caso 5:
      escreva("programa encerrado. ")
      pare
      caso contrario:
      escreva("opção invalida. ")
    }
  }  enquanto(opcao != 5)
  }
}
