fun collatzSteps(x: Int): Int {
    var count = 0
    var x1 = x
    if (x1 > 0) {
        while (x1 != 1) {
            count++
            if (x1 % 2 == 0)
                x1 /= 2
            else
                x1 = 3 * x1 + 1
        }
        return count
    } else
        return (0)
}