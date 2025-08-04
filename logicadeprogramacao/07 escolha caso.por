programa {
  funcao inicio() {
    // declaração de variaveis 
    inteiro opcao
    real x, y, result

    // entrada de dados 
    escreva("informe o valor de x: ")
    leia(x)
    escreva("informe o valor de y: ")
    leia(y)
    escreva("1 - Soma.\n ")
    escreva("2 - subtração.\n ")
    escreva("3 - multiplicação.\n ")
    escreva("4 - divisão.\n ")
    escreva("informe a opção desejada:\n ")
    leia(opcao)

    //escolha caso
    escolha (opcao)
    {
      caso 1: 
      result = x+y
      escreva("o resultado é ", result)
      pare
      caso 2: x-y
      escreva("o resultado é ", result)
      pare
      caso 3: 
      result= x*y
      escreva("o resultado é ", result)
      pare
      caso 4:
      result = x/y 
      escreva("o resultado é", result)
      pare
      caso contrario:
      escreva("oppção invalida")
    }
  }
}
