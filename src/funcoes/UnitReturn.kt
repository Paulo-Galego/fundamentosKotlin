package funcoes

fun imprimiorMaior1(a: Int, b: Int){
    println(Math.max(a,b))
}


fun imprimiorMaior2(a: Int, b: Int): Unit{
    println(Math.max(a,b))
}

fun imprimeValor3(a: Int, b: Int): Unit{
    println(Math.max(a,b))
    return
}

fun imprimeValor4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun imprimeValor5(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}


fun main() {
    imprimiorMaior1(2,1)
    imprimiorMaior2(2,1)
    imprimeValor3(2,1)
    imprimeValor4(2,1)
    imprimeValor5(2,1).run { 2 > 4 }.run { print("Resultado = $this") }


}