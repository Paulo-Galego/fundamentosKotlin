package funcoes

fun <T> filtrar(lista: List<T>, filtro: (T) -> Boolean): List<T> {
    val listaFiltrada = ArrayList<T>()
    for (e in lista) {
        if(filtro(e)){
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean{
    return  nome.length ==3
}

fun main() {
    //val nome = listOf("Gui", "Ana", "Julia", "Davi", "Miguel")
    val nome = listOf("123", "456", "14256", "18966", "46456454")
    println(filtrar(nome, ::comTresLetras))
}