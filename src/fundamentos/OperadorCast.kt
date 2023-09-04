package fundamentos

fun imprimirConceito(nota: Any) {
    //a interrogacao é um cast opcional, retorna null senao for Int
    // 7 é o valor padrao
    when(nota as? Int ?: 7){
        10,9 -> println("A")
        8,7-> println("B")
        6,5 -> println("C")
        4,3 -> println("D")
        2,1,0 -> println("E")
        else -> println("Nota Invalida")
    }

}

fun main() {
    val notas = arrayOf(9.6,3.8,7.2,5.5,4.1)
    for(nota in notas) {
        imprimirConceito(nota.toInt())
    }
}