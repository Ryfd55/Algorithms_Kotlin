fun printInfo9(n: Int) {
    if (n in 1000..9999) {
        val list = mutableListOf<Int>()
        var t = n
        var a = 0
        for (i in 0..3) {
            a = t % 10
            val add = list.add(a)
            t = (t - a) / 10
        }
        if ((list.get(0) + list.get(1)) == (list.get(2) + list.get(3)))
            println("$n - счастливое число")
        else
            println("Увы, $n - обычное число")
    }

}