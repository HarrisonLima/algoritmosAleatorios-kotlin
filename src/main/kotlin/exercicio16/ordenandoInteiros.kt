package exercicio16

fun main() {
    val array = IntArray(12)
    val size = array.size

    for (i in 0 until size) {
        var posicao = i + 1
        print("Informe o $posicao° número: ")
        array[i] = readLine()!!.toInt()
    }

    val sortedArray = array.sortedDescending()

    println("Array em ordem decrescente:")
    for (element in sortedArray) {
        println(element)
    }
}