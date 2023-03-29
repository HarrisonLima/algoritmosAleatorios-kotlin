package exercicio10

import java.util.Scanner;

fun main(){
    val scanner = Scanner(System.`in`)

    print("Informe o primeiro número: ")
    var firstNumber = scanner.nextDouble()

    print("Informe o segundo número: ")
    var secondNumber = scanner.nextDouble()

    print("Informe o terceiro número: ")
    var thirdNumber = scanner.nextDouble()

    var resultado = (firstNumber * firstNumber) + (secondNumber * secondNumber) + (thirdNumber * thirdNumber)

    println("A soma do quadrado dos três números é: ${resultado}")
}


//➢ Construir um programa que leia três valores numéricos inteiros
//➢ Apresentar como resultado, armazenado em memória, o valor da soma dos quadrados dos três valores lidos.
