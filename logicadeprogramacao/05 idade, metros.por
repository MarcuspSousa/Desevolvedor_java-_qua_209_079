programa {
  funcao inicio() {
   //declaração de variavel 
   cadeia nome 
   inteiro idade
   real altura

   // entrada de dados 
   escreva("informe seu nome: ")
   leia(nome)
   escreva("informe sua idade:")
   leia(idade)
   escreva("informe sua altura em metros:")
   leia(altura) 

   // verifica a idade e a altura
   se(idade >= 12 e altura >= 1.15)
   {
    escreva(nome,"esta autorizado a entrar no trem fantasma")
   }
   senao
   {
    escreva(nome, "não esta autorizado a entrar no trem fantasma")
   }
  }
}
