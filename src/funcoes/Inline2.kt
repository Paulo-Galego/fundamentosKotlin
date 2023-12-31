package funcoes

inline fun <T>executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    }finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int): Int{
    return a +b
}

fun main() {
    val resultado = executarComLog("somar"){
        somar2(3,4)
        1 + 2
    }

    println(resultado)
}