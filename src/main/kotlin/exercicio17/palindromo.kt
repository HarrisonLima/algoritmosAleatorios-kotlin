package exercicio17

fun main() {
    print("Digite uma palavra, frase ou número: ")
    val string = readLine()!!.trim()

    val isPalindrome = string == string.reversed()

    println("Palavra/Frase/Número: $string")
    if (isPalindrome) {
        println("É um palíndromo")
    } else {
        println("Não é um palíndromo")
    }
}

//➢ Crie um programa que aceite uma palavra, frase ou número.
//➢ Imprima a palavra e se ela é ou não um palíndromo.
//➢ Palíndromo é uma palavra, frase ou número que permanece igual quando lida de trás para frente.
