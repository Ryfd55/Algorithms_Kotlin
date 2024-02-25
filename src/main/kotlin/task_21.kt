fun differentNumbers(n: Int): Int {
    val setOfNumbers: MutableSet<Int> = mutableSetOf()
    var year = n
    var number: Int
    for (i in n + 1..9000) {
        setOfNumbers.clear()
        var temp = i
        for (j in 1..4) {
            number = temp % 10
            setOfNumbers.add(number)
            temp /= 10
        }
        if (setOfNumbers.size == 4) {
            year = i
            break
        }
    }
    return year
}
