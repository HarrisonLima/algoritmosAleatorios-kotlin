package exercicio11

fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()?.toInt() ?: 0

    print("Digite o segundo número: ")
    val num2 = readLine()?.toInt() ?: 0

    print("Digite o terceiro número: ")
    val num3 = readLine()?.toInt() ?: 0

    val soma = num1 + num2 + num3
    val resultado = soma * soma

    println("O resultado é: $resultado")
}
