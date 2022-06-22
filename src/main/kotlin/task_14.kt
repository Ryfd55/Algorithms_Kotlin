fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (i in 2 .. n/2) {
        if (n % i == 0)
            sum += i
    }
    return sum == n
}


