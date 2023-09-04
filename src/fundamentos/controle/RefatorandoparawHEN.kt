package fundamentos.controle

fun main() {
    val nota = 7

    when(nota){
        10,9 -> println("Fantastico")
        8,7 ->  println("Parabéns")
        6,5,4 ->  println("Tem com o recuperar")
        in 0..3 -> println("Te vejo no próximo semestre")
        else -> println("Nota inválida")
    }
}