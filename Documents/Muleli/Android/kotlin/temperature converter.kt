fun main() {
    println("Enter temperature in Celsius:")
    val celsius: Double = readLine()?.toDoubleOrNull() ?: return

    val fahrenheit = celsiusToFahrenheit(celsius)

    println("$celsius degrees Celsius is equal to $fahrenheit degrees Fahrenheit.")
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}
