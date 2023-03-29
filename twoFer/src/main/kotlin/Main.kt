fun main() {
    println("Digite um nome:")
    var nome = readLine()
    if (nome == "") {
        nome = "você";
    }
    println(TwoFer(nome))
}

fun TwoFer(nome: String?): String {
    return "Um para ${nome}, um para mim."
}
