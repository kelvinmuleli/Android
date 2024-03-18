fun main() {
    val num1 = 15
    val num2 = 27
    val num3 = 9

    val maxNumber = maxOf(num1, num2, num3)
    val minNumber = minOf(num1, num2, num3)

    println("Maximum number among $num1, $num2, and $num3 is: $maxNumber")
    println("Minimum number among $num1, $num2, and $num3 is: $minNumber")
}