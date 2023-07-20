fun main() {
    val intValue: Int = 42
    val doubleValue: Double = intValue.toDouble()

    println("Integer value: $intValue")
    println("Converted to Double: $doubleValue")

    val stringValue: String = "123"
    val intValue2: Int = stringValue.toInt()

    println("String value: $stringValue")
    println("Converted to Integer: $intValue2")

    val stringValue2: String = "3.14"
    val doubleValue2: Double = stringValue.toDouble()

    println("String value: $stringValue2")
    println("Converted to Double: $doubleValue2")
}
