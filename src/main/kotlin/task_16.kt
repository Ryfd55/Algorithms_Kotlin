fun fib(n: Int): List<Int> {
    var x =0
    var x1 = 1
    var x2 = 1
    val fibArray = mutableListOf<Int>()
    for (i in 1..n){
        fibArray.add(x)
        x = x1
    x1=x2
    x2=x+x1

        }

    return fibArray


}