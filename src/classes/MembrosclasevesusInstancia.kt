package classes



class ItempDePedido(val nome: String, val preco: Double){
    companion object{
        fun create(nome: String, preco: Double) = ItempDePedido(nome, preco)
        @JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto():Double {
        return preco - preco * desconto
    }

}

fun main() {
    val item1 = ItempDePedido.create("TV",2989.90)
    val item2 = ItempDePedido.create("Liquidificador",150.00)
    ItempDePedido.desconto = 0.10

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())

}