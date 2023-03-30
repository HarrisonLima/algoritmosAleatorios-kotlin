package exercicio9

fun main() {
    // Solicita a cotação do dólar ao usuário
    print("Digite a cotação atual do dólar (ex: 5.40): ")
    val cotacaoDolar = readLine()!!.toDouble()

    // Solicita a quantidade de reais disponível com o usuário
    print("Digite a quantidade de reais que deseja converter: ")
    val reais = readLine()!!.toDouble()

    // Calcula a conversão e armazena o resultado em memória
    val conversao = reais / cotacaoDolar

    // Apresenta o resultado ao usuário
    println("R$$reais equivalem a US$${"%.2f".format(conversao)}")
}
