package exercicio12

fun main() {
    println("Digite a distância percorrida pelo projétil em quilômetros:")
    val distancia = readLine()?.toDoubleOrNull()

    println("Digite o tempo que o projétil levou para percorrer essa distância em minutos:")
    val tempo = readLine()?.toDoubleOrNull()

    if (distancia != null && tempo != null && tempo != 0.0) {
        val velocidade = (distancia * 1000) / (tempo * 60)
        println("A velocidade do projétil é de $velocidade metros por segundo.")
    } else {
        println("Valores inválidos, Tente novamente!")
    }
}
