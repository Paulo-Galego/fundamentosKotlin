package fundamentos
//Função sem retorno
fun imprimirSoma(a: Int, b: Int){
    println("imprimirSoma: " + a+b)
}

//Função com retorno
fun soma(a: Int, b: Int=1): Int{
    return  a + b
}

fun main() {
imprimirSoma(4,5)
    println("soma" +soma(11))
}