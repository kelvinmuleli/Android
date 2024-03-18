fun main() {
    println("Enter your name:")
    val name = readLine()
    println("Enter your age:")
    val age = readLine()?.toIntOrNull()
    if (name != null && age != null) {
        println("Hello, $name! You are $age years old.")
    } else {
        println("Invalid input. Please enter a valid name and age.")
    }
}
