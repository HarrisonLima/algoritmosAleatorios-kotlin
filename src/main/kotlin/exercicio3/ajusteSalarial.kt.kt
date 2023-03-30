package exercicio3

fun main() {
    println("Digite o salário mensal: ")
    val salarioMensal: Double = readLine()?.toDouble() ?: 0.0

    println("Digite o percentual de reajuste: ")
    val percentualReajuste: Double = readLine()?.toDouble() ?: 0.0

    val novoSalario: Double = salarioMensal * (1 + percentualReajuste / 100)

    println("Novo salário: R$%.2f".format(novoSalario))
}



