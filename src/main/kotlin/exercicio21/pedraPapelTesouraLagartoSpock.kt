package exercicio21

fun main() {
    val player1 = getPlayerChoice()
    val player2 = getPlayerChoice()
    val result = determineWinner(player1, player2)
    println(result)
}

fun getPlayerChoice(): String {
    print("Escolha entre Pedra, Papel, Tesoura, Lagarto ou Spock: ")
    return readLine()!!.lowercase()
}

fun determineWinner(player1: String, player2: String): String {
    return when {
        player1 == player2 -> "Empate"
        (player1 == "tesoura" && player2 == "papel") ||
                (player1 == "papel" && player2 == "pedra") ||
                (player1 == "pedra" && player2 == "lagarto") ||
                (player1 == "lagarto" && player2 == "spock") ||
                (player1 == "spock" && player2 == "tesoura") ||
                (player1 == "tesoura" && player2 == "lagarto") ||
                (player1 == "lagarto" && player2 == "papel") ||
                (player1 == "papel" && player2 == "spock") ||
                (player1 == "spock" && player2 == "pedra") ||
                (player1 == "pedra" && player2 == "tesoura") -> "Jogador 1 ganhou!"
        else -> "Jogador 2 ganhou!"
    }
}
