package fundamentos.controle

fun main() {
    var opcao: Int = 0

    while (opcao != -1){
        print("Informe uma opção: ")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    }
    println("Até a próxima!")

    println("* While 2*********************************************")

    var contador: Int = 1

    while(contador <= 10){
        println("contador $contador")
        contador++
    }

}