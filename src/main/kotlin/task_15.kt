fun digitCountInNumber(n: Long, m: Long): Long {
    var nn = n
    var nn2 = n
    var count = 0
    var count2: Long = 0
    val nol:Long = 0
    for (i in 1..n) {
        nn /= 10
        count++
        if (nn == nol) break
    }
    for (j in 1..count) {
        if (nn2 % 10 == m)
            count2++
        nn2 /= 10
    }
    return (count2)
}



