package classes

import funcoes.filtrar

class Cliente2{
    constructor(nome:String){
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value){
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main() {
    val cliente = Cliente2("Paulo")
    println(cliente.nome)

    val c2 = Cliente2("Pedro")
    c2.nome = "Ana"
    println(c2.nome)
    
}