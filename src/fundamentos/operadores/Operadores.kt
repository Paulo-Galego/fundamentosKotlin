package fundamentos.operadores

import java.util.Date

fun main() {
    println("Atribuição: Binario")
    var a: Int  =7
    var b: Int  =3

    b+=a //atribuição aditiva, b = b +a
    b -= 4 //Atribuição subtrativa b = b -4
    b *= 2 //
    b /= 2
    b %= 2 //Modulo pega o resto

    println(b)

    println("Operadores Artiméticos")
    val(v1,v2,v3,v4) = listOf(3,5,1,15)

    val soma = v1+v2+v3+v4
    val sub = v1+v2+v3+v4
    val modulo = v1 % 2 // modulo é o resto da divisão, se a divisão nao tiver resto  sera 0

    println("Operadores Relacionais")

    println("Banana" === "Banana") //3 iguais, retorna booleano
    println(3 != 2) //em Kotlin é dois iguais

    val d1 = Date(0) // quando usa 0, p sistema para 01/01/1970
    val d2 = Date(0)
    //Igualdade refercial
    println(d1===d2)
    println(d1==d2)

    println("Operadores Unario")
    var num1: Int = 1
    num1++

    println(num1)
    num1--
    println(num1)

}