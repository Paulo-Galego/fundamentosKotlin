package fundamentos.operadores

fun obterResultado(nota: Double) :String = if(nota >= 7.0) "Passou" else "Reprovou"


fun main() {
    val nota: Double = 7.0
    val resultado: String = if(nota >=7) "Aprovado" else "Reprovado"
    println(resultado)

    println("Segundo Exemplo")
    println(obterResultado(8.3))
}