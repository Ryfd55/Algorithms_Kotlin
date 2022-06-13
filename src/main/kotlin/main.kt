import kotlin.random.Random


fun main() {

//                      task_5     Разделение и объединение массивов (zip)
//    val phones = mutableListOf<Any>()
//    val nameSurname = mutableListOf<String>()
//
//    for (i in 0..20) {
//        nameSurname.add("Имя$i Фамилия$i")
//        val pref = "+7-9"
//        val tire = "-"
//        val str1 = Random.nextInt(0, 9).toString()
//        val str2 = Random.nextInt(0, 9).toString()
//        val str3 = Random.nextInt(0, 9).toString()
//        val str4 = Random.nextInt(0, 9).toString()
//        val str5 = Random.nextInt(0, 9).toString()
//        val str6 = Random.nextInt(0, 9).toString()
//        val str7 = Random.nextInt(0, 9).toString()
//        val str8 = Random.nextInt(0, 9).toString()
//        val str9 = Random.nextInt(0, 9).toString()
//        val str = pref + str1 + str2 + tire + str3 + str4 + str5 + tire + str6 + str7 + tire + str8 + str9
//        phones.add(str)
//////      Упрощенный, но более короткий вариант вида номера телефона:
////        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
//    }
//    println(nameSurname)
//////        Выделение фамилий и объединение их с номерами телефонов
//    val surname = nameSurname.map { it.substringAfter(' ') }
//    val newNS = surname.zip(phones)
//    for (i in newNS) {
//        println("Фамилия: ${i.first} Телефон: ${i.second}")
//    }



//                      task_4     Бесконечная последовательность + take
//    val array = generateSequence(1) { it + 1 }
//    val list = array.take(100).map { "Сотрудник №$it" }
//    for (i in list)
//        println(i)


//                      task_3     MAP метод
//    val randomCollect = mutableListOf<Int>()
//    for (i in 0..99) {
//        randomCollect.add(Random.nextInt(0, 1000))
//    }
//    val collect1 = randomCollect.filter { it % 3 == 0 || it % 5 == 0 }.map { it * it }.sortedDescending().toString()
//    println(randomCollect)
//    println(collect1)


//                      task_2     ПУЗЫРЬКОВАЯ СОРТИРОВКА
//    var oldList = mutableListOf(232, 34, 45, 3, 35, 2)
//    val res = sort(oldList)
//    println(res)


//                      task_1     FILTER метод
//    val listOfNames = mutableListOf("Alex", "Bob", "Antony")
//    val listOfANames = listOfNames.filter { it.first() == 'A' }
//    println(listOfANames)

}



