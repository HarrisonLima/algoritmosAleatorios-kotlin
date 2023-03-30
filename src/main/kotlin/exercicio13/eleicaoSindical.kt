package exercicio13

fun main() {
    print("Digite a quantidade de votos válidos do candidato A: ")
    val votosA = readLine()!!.toInt()

    print("Digite a quantidade de votos válidos do candidato B: ")
    val votosB = readLine()!!.toInt()

    print("Digite a quantidade de votos válidos do candidato C: ")
    val votosC = readLine()!!.toInt()

    print("Digite a quantidade de votos nulos: ")
    val votosNulos = readLine()!!.toInt()

    print("Digite a quantidade de votos em branco: ")
    val votosEmBranco = readLine()!!.toInt()

    val totalEleitores = votosA + votosB + votosC + votosNulos + votosEmBranco

    val percentualVotosValidos = 100.0 * (votosA + votosB + votosC) / totalEleitores
    val percentualVotosA = 100.0 * votosA / totalEleitores
    val percentualVotosB = 100.0 * votosB / totalEleitores
    val percentualVotosC = 100.0 * votosC / totalEleitores
    val percentualVotosNulos = 100.0 * votosNulos / totalEleitores
    val percentualVotosEmBranco = 100.0 * votosEmBranco / totalEleitores

    println("Número total de eleitores: $totalEleitores")
    println("Percentual de votos válidos em relação à quantidade de eleitores: $percentualVotosValidos%")
    println("Percentual de votos válidos do candidato A em relação à quantidade de eleitores: $percentualVotosA%")
    println("Percentual de votos válidos do candidato B em relação à quantidade de eleitores: $percentualVotosB%")
    println("Percentual de votos válidos do candidato C em relação à quantidade de eleitores: $percentualVotosC%")
    println("Percentual de votos nulos em relação à quantidade de eleitores: $percentualVotosNulos%")
    println("Percentual de votos em branco em relação à quantidade de eleitores: $percentualVotosEmBranco%")
}
