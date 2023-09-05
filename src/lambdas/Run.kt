package lambdas

data class Casa(var endereco: String="", var numero: Int = 0)

fun main() {
    var casa = Casa()

    casa.run {
        endereco = "Rua abc"
        numero = 1544
    }

    print(casa)
}