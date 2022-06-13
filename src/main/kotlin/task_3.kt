import kotlin.random.Random

/**                 task_3     MAP
*/
//Создать коллекцию случайных чисел в диапазоне от 0 до 1000 размером 100 элементов
//Оставить только те числа, которые без остатка делятся на 3 или 5
//Каждое из оставшихся возведите в квадрат
//Отсортировать по убыванию
// Преобразовать в коллекцию элементов типа String


fun printInfo3 () {
    val randomCollect = mutableListOf<Int>()
    for (i in 0..99) {
        randomCollect.add(Random.nextInt(0, 1000))
    }
    val collect1 = randomCollect.filter { it % 3 == 0 || it % 5 == 0 }.map { it * it }.sortedDescending().toString()
    println(randomCollect)
    println(collect1)
}