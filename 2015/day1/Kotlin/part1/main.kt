fun main(args: Array<String>) {
    println("Processing: ${args[0]}")
    var count: Int = 0
    for(i in args[0].indices){
        if(args[0][i].compareTo('(')==0){
            count++
        } else {
            count--
        }
    }
    println(count)
}