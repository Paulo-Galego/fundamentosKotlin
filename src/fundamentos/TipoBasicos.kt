package fundamentos

fun main() {

    //Tipos numéricos Inteiros
    val num1 : Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_157_157 // Long.MaxValue

    print(Long.MAX_VALUE)

    //Tipos numéricos pontos flutuantes (reais)
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipo Caractere
    val char: Char = '7' //Outros exdmplos '1', 'g'

    //Tipo Booleano
    val boolean: Boolean = true

    println(listOf(num1,num2,num3,num4,num5,num6, char, boolean ))

    println(2 is Int)
    println(6465465465465 is Long)

    //Tudo é  objeto
    println(10.dec())
}