package fundamentos

fun main() {
    val a = 1

    //Numero para String
    println(a.toString() + 1)

    //String para Número
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    //Elvis operator, caso nao consiga converter para INT, printa
    println("Teste".toIntOrNull() ?: 0)

    println("1".toInt()+3)

}