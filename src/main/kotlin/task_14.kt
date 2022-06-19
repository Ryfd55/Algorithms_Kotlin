//fun isPerfect(n: Int): Boolean {
//    var sum = 1
//    for (i in 2 .. n/2) {
//        if (n % i == 0)
//            sum += i
//    }
//    return sum == n
//}
import kotlin.math.pow

fun digitCountInNumber(n: Int, m: Int): Int {
    var nn = n
    var nn2 = n
    var count = 0
    var count2 = 0
    for (i in 1..n) {
        nn /= 10
        count++
        if (nn == 0) break
    }
    for (j in 1..count) {
        if (nn2 % 10 == m)
            count2++
        nn2 /= 10
    }
    return (count2)
}




