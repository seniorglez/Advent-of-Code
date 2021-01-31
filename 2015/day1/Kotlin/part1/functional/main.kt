fun main(args: Array<String>) {
    println("Processing: ${args[0]}")
    println(count(args[0],0))
}

tailrec fun count(input: String, counter: Int): Int =
    when(input.length) {
        0 ->  counter
        else -> if (input[0].compareTo('(')==0) {
            count(input.substring(1, input.length), counter -1)
        } else {
            count(input.substring(1, input.length), counter +1)
        }
    }