fun main() {
    val num1 = 24
    val num2 = 36

    val lcm = findLCM(num1, num2)
    println("LCM of $num1 and $num2 is: $lcm")
}

fun findLCM(num1: Int, num2: Int): Int {
    return (num1 * num2) / findGCD(num1, num2)
}

fun findGCD(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }
    return x
}