fun main(args: Array<String>) {
    println("Processing: ${args[0]}")
    println(enterTheBasement(args[0]))
}

fun enterTheBasement(input: String): Int {
    val chars = input.toCharArray()
    var count = 0;
    chars.forEachIndexed { i, char ->
        when(char) {
            '(' -> count++
            else -> count--
        }
        if(count == -1) {
            return i + 1
        }
    }
    return -1
}