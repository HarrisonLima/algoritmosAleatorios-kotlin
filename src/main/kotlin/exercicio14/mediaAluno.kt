package exercicio14

import java.util.Scanner;

fun main(){
    val scanner = Scanner(System.`in`)

    print("Informe a nota do primeiro bimestre: ")
    var primeiroBimestre = scanner.nextDouble()

    print("Informe a nota do segundo bime   stre: ")
    var segundoBimestre = scanner.nextDouble()

    print("Informe a nota do terceiro bimestre: ")
    var terceiroBimestre = scanner.nextDouble()

    print("Informe a nota do quarto bimestre: ")
    var quartoBimestre = scanner.nextDouble()

    var media = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4

    println("Média do aluno: ${media}")
    if (media >= 5){
        println("Situação: APROVADO")
    } else {
        println("Situação: REPROVADO")
    }
}

//➢ Crie um programa que realize a leitura dos valores de quatro notas escolares bimestrais de um aluno.
//➢ Calcular a média desse aluno e apresentar a mensagem “Aprovado” se a média obtida for maior ou igual a 5;
//➢ Caso contrário, apresentar a mensagem “Reprovado”.
//➢ Informar também, após a apresentação das mensagens, o valor da média obtida pelo aluno