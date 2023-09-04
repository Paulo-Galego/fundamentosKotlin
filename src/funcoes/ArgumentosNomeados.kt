package funcoes

fun relacaoDeTrabalhao(chefe: String, funcionario: String):String {
    return "$funcionario é  subordinado(a) à $chefe"
}

fun main() {
    println(relacaoDeTrabalhao("João", "Maria"))
    println(relacaoDeTrabalhao(funcionario = "João", chefe = "Maria"))

}