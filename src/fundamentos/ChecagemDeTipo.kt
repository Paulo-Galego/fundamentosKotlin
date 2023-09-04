package fundamentos

fun main() {
    //Tipo Any é qualquer valor
    //val valor: Any= 123
    val valor ="abc"

    if(valor is String) {
        println(valor)
    } else if(valor !is String){
        println("Não é uma String")
    }

    println("SmartCast")
    souEsperto(1)
    souEsperto2(1.2)

}

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.uppercase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}
fun souEsperto2(x: Any){
    when(x){
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Repense sua vida")
    }
}
