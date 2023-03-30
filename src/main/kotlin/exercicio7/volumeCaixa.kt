package exercicio7

import java.util.Scanner;

fun main(){
    val scanner = Scanner(System.`in`)

    print("Informe o comprimento: ")
    var comprimento = scanner.nextDouble()

    print("Informe a largura: ")
    var largura = scanner.nextDouble()

    print("Informe a altura: ")
    var altura = scanner.nextDouble()

    var volume = comprimento * largura * altura

    println("O volume da caixa é: ${volume}")
}

//Crie um programa que calcule e apresente o valor do volume de uma caixa retangular.
//Utilize a fórmula:
//VOLUME = COMPRIMENTO * LARGURA * ALTURA.