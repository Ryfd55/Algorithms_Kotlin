    fun revert(n: Int): Int {
        var res = 0
        var count = 1
        var tmp = n
        while (n / count != 0) {
            tmp %= 10
            res = 10 * res + tmp
            count *= 10
            tmp = n / count
        }
        return (res)
    }