package fundamentos

fun main() {
    val opcional: String? = ""
    val obrigatorio: String = opcional ?: "Valor Padrão"
    println(obrigatorio)
}