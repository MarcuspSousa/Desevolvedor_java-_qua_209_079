programa {
  funcao inicio() {
    // declaração de vetor
    cadeia nomes[10]
    inteiro idades[10]

    // entrada de dados
    para (inteiro i = 0; i < 10; i++)
    {
      escreva("informe o", i+1, "º nome do usarario: ")
      leia(nomes[i])
      escreva("informe a idade do ", i+1, "º usuario: ")
      leia(idades[i])
    }
    // saida de daods 
    para (inteiro i = 0; i < 10; i++)
    {
      escreva("nome do ", i+1, "º usuario", nomes [i],".\n")
      escreva("idade: ", idades[1], "\n\n")
    }
  }
}
