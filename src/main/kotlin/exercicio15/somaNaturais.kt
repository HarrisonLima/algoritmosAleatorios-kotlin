package exercicio15

import java.util.Scanner;

fun main(){
    val inicio = 1
    val final = 100
    var soma = 0

    for (i in inicio..final){
        soma += i
    }
    println("Intervalo: $inicio..$final")
    println("Soma dos números: $soma")
}

//➢ Crie um programa que apresente a soma de todos os valores de um intervalo informado.
//➢ O intervalo deve conter 100 números naturais.
//➢ Imprima o intervalo informado e o resultado da sua soma.
