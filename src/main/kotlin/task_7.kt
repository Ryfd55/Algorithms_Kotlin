
/**                      task_7     Простые числа
 */

// Вывести все простые числа до заданного значения


fun printInfo7 (n:Int) {
val li = mutableListOf<Int>()
for (num in 2..n) {
    if ((2 until num).none { num % it == 0 })
        li.add(num)
}
println(li)
}