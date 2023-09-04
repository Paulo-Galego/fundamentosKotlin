package fundamentos.controle

fun main() {
    for(i in 1 ..10){
        if(i == 5){
            break
        }
        println("Atual: $i")
    }
    println("Fim")
    println("Break 2 (rotulado)**********************")

    externo@for(i in 1..15){
        for(j in 1..15){
            if(i ==2 && j ==9) break@externo
            println("$i $j")
        }

    }
    println("Fim")

    println("Continue**********************")

    for(i in 1..10){
        if(i==5){
            continue
        }
        println("Atual: $i")
    }


}