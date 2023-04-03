package exercicio19

fun main() {
    print("Digite um numeral romano: ")
    val romanNumeral = readLine()
    val num = romanNumeral?.let { romanToInt(it) }
    if (num != null) {
        println("O numeral romano $romanNumeral corresponde ao número inteiro $num")
    } else {
        println("Nenhum numeral romano digitado ou formato inválido.")
    }
}

fun romanToInt(romanNumeral: String): Int {
    val romanToDecimal = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
    )
    var result = 0
    var prev = 0
    for (i in romanNumeral.length - 1 downTo 0) {
        val current = romanToDecimal[romanNumeral[i]]!!
        if (current >= prev) {
            result += current
        } else {
            result -= current
        }
        prev = current
    }
    return result
}
