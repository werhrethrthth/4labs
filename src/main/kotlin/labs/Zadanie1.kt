import kotlin.random.Random
fun main() {
    val random = Random(System.currentTimeMillis())
    val ex1ocenka = random.nextInt(1, 10)
    val ex1opodgotovka = random.nextBoolean()
    val ex2ocenka = random.nextInt(1, 10)
    val ex2opodgotovka = random.nextBoolean()
    val ex3ocenka = random.nextInt(1, 10)
    val ex3opodgotovka = random.nextBoolean()
    println("Экз 1 = $ex1ocenka, подготовился ${if (ex1opodgotovka) "Хорошо" else "Плохо"}")
    println("Экз 2 = $ex2ocenka, подготовился ${if (ex2opodgotovka) "Хорошо" else "Плохо"}")
    println("Экз 3 = $ex3ocenka, подготовился ${if (ex3opodgotovka) "Хорошо" else "Плохо"}")
}