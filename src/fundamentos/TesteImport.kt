package fundamentos
import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import  fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.PacoteB.*

fun main() {
    kotlin.io.println(funcaoSimples("ok"))

    val coisa = Coisa("Bola")
    println(coisa.nome)
    println(CARA)

    println("${soma(2,3)}  ${ subtracao(4,6) }")



}