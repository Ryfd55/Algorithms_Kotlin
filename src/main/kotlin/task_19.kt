fun isCoPrime(m: Int, n: Int): Boolean {
    var res = true
    for (i in 2..n / 2) {
        if (m % i == 0 && n % i == 0)
            res = false
    }
    return (res)
}