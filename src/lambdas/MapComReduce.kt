package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto("Fichario escolar", 21.90),
    Produto("Lápis de cor", 11.90),
    Produto("Borracha", .70),
    Produto("Apontador", 1.80)
)

fun main() {
    val totalizar = {total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é: ${precoTotal /  materialEscolar.size}")
}

