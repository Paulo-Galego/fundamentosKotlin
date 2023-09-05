package classes

class Cliente{
    var nome: String =""
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "Paulo"
    println("O cliente é: ${cliente.nome}")
}

