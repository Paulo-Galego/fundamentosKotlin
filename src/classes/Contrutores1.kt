package classes

class Filme{
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome:String, anoLancamento: Int, genero: String="Ação"){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme(nome = "Rambo", anoLancamento = 1985)
    println("O genero: ${filme.genero} ${filme.nome} foi lançado em ${filme.anoLancamento}")
}