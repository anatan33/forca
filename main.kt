import kotlin.random.Random

fun main() {
    val words = listOf("Code", "Coffe", "Bug")

    //Retorna uma palavra aleatóio dentro de uma lista de palavras
    fun getRandomWord(value: Int): String = words.get(Random.nextInt(0, value))

    println(getRandomWord(words.size))
}