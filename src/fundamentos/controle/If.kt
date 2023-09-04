package fundamentos.controle

fun main() {
    val nota: Double = 8.3

    if (nota >= 7.0)
        println("Aprovado")

    val nota2: Double = 6.3

    println("*************************************")

    if (nota2 >= 7.0){
        println("Aprovado")
    }else{
        println("Reprovado")
    }

    println("\n**If else em expressões***********************************")

    val num1: Int = 7
    val num2: Int = 3

    val maiorValor = if(num1 > num2) {
        println("processando if")
        num1 //a ultima sentença do bloco é o retorno da expressão
    }else{
        println("processando else")
        num2
    }

    println("O maior valor é ${maiorValor}.")


    println("\n**Multiplos bloco if***********************************")
    val nota3: Double = 15.0
    if (nota3 in (9.0..10.0)){
        println("Fantastico")
    }else if(nota3 in 7.0 .. 8.0){
        println("Parabéns")
    }else if(nota3 in 4.0 .. 6.0){
        println("Tem como recuperar")
    }else if (nota3 in 0.0 .. 3.0){
        println("Te vejo no próximo semestre")
    }else {
        println("Nota inválida")
    }

    print(6 in 4..7)


}