fun differentNumbers(n: Int): Int {
    val setOfNumbers: MutableSet<Int> = mutableSetOf()
    var year = n
    var number:Int
    var temp: Int
    for (i in n..2015) {
        year++
        setOfNumbers.clear()
        temp = year             //каждый следующий год, который мы проверяем
        for (j in 1..4) {
            number = temp % 10  //цифра в годе
            setOfNumbers.add(number)
            temp /= 10          //оставшиеся цифры в годе
        }
        if (setOfNumbers.size == 4) break
    }
    return (year)
}