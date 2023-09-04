package fundamentos.controle

fun main() {
    println("For 2*********************")
    for(i in 1..10){
        println(i)
    }

    println("For 2*********************")
    for(i in 10 downTo 1){
        println("i = $i")
    }

    println("For 3*********************")
    for(i in 0 .. 10 step 2){
        println("i = $i")
    }
    println("Decrescente*********************")
    for(i in 10 downTo 0 step 2){
        println("i = $i")
    }

    println("For 4*********************")
    val alunos = arrayListOf("André", "Carla", "Marcos")
    for((indice,aluno) in alunos.withIndex()){
        println("${indice+1} - $aluno")
    }
}