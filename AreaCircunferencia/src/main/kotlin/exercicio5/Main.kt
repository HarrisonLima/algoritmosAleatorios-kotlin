package exercicio5

import java.util.Scanner;

fun main(){
    val scanner = Scanner(System.`in`)
    val pi = 3.14159
    var area = 0.00

    print("Insira o comprimento do raio: ")
    var raio = scanner.nextDouble()

    area = (raio * raio) * pi
    println("Valor da área: ${area}")

}

//➢ Crie um programa que calcule a área de uma circunferência e apresente a medida da área calculada.
//➢ Para fazer o cálculo da área de uma circunferência, é necessário conhecer primeiramente a fórmula que
//executa o cálculo, sendo A = πR2, em que A é a variável que conterá o resultado do cálculo da área, π é o
//valor da constante pi (3.14159265) e R é o valor da variável que representa o raio.
//➢ Estabeleça o seguinte:
//○ Ler um valor para o raio.
//○ Estabelecer que π venha a possuir o valor 3.14159265.
//○ Efetuar o cálculo da área, elevando ao quadrado o valor da variável e multiplicando esse valor por π.
//○ Imprimir o valor da variável.
