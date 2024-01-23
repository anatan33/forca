import kotlin.random.Random

fun main() {
    val words = listOf("Code", "Coffe", "Bug")

    /*
    * feat para obter uma palavra aleatória
    */

    fun getWord(value: Int):Int = Random.nextInt(0, value)
    println(getWord(words.size))
}