package funcoes

inline fun transacao(funcao: () -> Unit){
    println("abrindo transação")
    try {
        funcao()
    }finally {
        println("fechando transação")
    }
}


fun main() {
    transacao {
        println("Executando SQl1...")
        println("Executando SQl2...")
        println("Executando SQl3...")
    }
}