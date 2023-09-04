package fundamentos.controle

fun main() {
    var opcao: Int  =-1
    do {
        print("Informe a opção: ")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("você escolheu a opção $opcao")
    }while(opcao != -1)

    println("Até a próxima")
}