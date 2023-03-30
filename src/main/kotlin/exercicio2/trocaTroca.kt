package exercicio2
fun main() {
    print("Digite o valor de A: ")
    var a = readLine()!!.toInt()
    print("Digite o valor de B: ")
    var b = readLine()!!.toInt()

    val temp = a
    a = b
    b = temp

    println("Após a troca, o valor de A é $a e o valor de B é $b")
}