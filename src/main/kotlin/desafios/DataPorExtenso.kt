package desafios

fun main() {
    val entrada: String? = readLine()
    val (dia, mes, ano) = entrada!!.split("/")
    val mesInteiro = mes.toInt()

    when{
        mesInteiro == 1 -> print("$dia de Janeiro de $ano")
        mesInteiro == 2 -> print("$dia de Fevereiro de $ano")
        mesInteiro == 3 -> print("$dia de Março de $ano")
        mesInteiro == 4 -> print("$dia de Abril de $ano")
        mesInteiro == 5 -> print("$dia de Maio de $ano")
        mesInteiro == 6 -> print("$dia de Junho de $ano")
        mesInteiro == 7 -> print("$dia de Julho de $ano")
        mesInteiro == 8 -> print("$dia de Agosto de $ano")
        mesInteiro == 9 -> print("$dia de Setembro de $ano")
        mesInteiro == 10 -> print("$dia de Outubro de $ano")
        mesInteiro == 11 -> print("$dia de Novembro de $ano")
        mesInteiro == 12 -> print("$dia de Dezembro de $ano")
        else -> print("Mês Inválido!")
    }

    //TODO("Imprimir a saída: $dia de $mesPorExtenso de $ano")
}