package exercicio8

fun main() {

    print("Informe a cotação do dólar: ")
    val cotacao = readLine()!!.toDouble()

    print("Informe a quantidade de dólares disponível: ")
    val dolares = readLine()!!.toDouble()
    val conversao = dolares * cotacao

    println("O valor em real (R$) é: R$ %.2f".format(conversao))
}


