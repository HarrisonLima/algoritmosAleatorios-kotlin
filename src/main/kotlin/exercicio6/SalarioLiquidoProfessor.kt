package exercicio6

fun main() {
    print("Digite o valor da hora-aula: ")
    val valorHoraAula = readLine()?.toDouble() ?: 0.0

    print("Digite o número de horas trabalhadas no mês: ")
    val horasTrabalhadas = readLine()?.toInt() ?: 0

    print("Digite o percentual de desconto do INSS: ")
    val percentualDesconto = readLine()?.toDouble() ?: 0.0

    val salarioBruto = valorHoraAula * horasTrabalhadas
    val desconto = salarioBruto * (percentualDesconto / 100)
    val salarioLiquido = salarioBruto - desconto

    println("O salário bruto é R$ $salarioBruto")
    println("O desconto é R$ $desconto")
    println("O salário líquido é R$ $salarioLiquido")
}