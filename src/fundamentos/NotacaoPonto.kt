package fundamentos

fun main() {
    val a: Int =33.dec()
    var b: String = a.toString()
    var c: Int = b.toInt()

    println("Int: $a")
    println("Primeiro char da string b é: ${b.last()}")
}