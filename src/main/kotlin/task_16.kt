fun fib(n: Int): List<Int> {
    var x1 = 0
    var x2 = 1
    var x3 = 1
    val fibArray = mutableListOf<Int>()
    for (i in 1..n) {
        fibArray.add(x1)
        x1 = x2
        x2 = x3
        x3 = x1 + x2
    }
    return fibArray
}