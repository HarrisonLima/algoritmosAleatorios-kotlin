package exercicio20

fun main() {
    val player1 = getPlayerChoice()
    val player2 = getPlayerChoice()
    val result = determineWinner(player1, player2)
    println(result)
}

fun getPlayerChoice(): String {
    print("Escolha entre Pedra, Papel ou Tesoura: ")
    return readLine()!!.lowercase()
}

fun determineWinner(player1: String, player2: String): String {
    return when {
        player1 == player2 -> "Empate"
        player1 == "pedra" && player2 == "tesoura" -> "Jogador 1 ganhou!"
        player1 == "tesoura" && player2 == "papel" -> "Jogador 1 ganhou!"
        player1 == "papel" && player2 == "pedra" -> "Jogador 1 ganhou!"
        else -> "Jogador 2 ganhou!"
    }
}
