import kotlin.random.Random

fun printInfo5() {
    val phones = mutableListOf<Any>()
    val nameSurname = mutableListOf<String>()

    for (i in 0..20) {
        nameSurname.add("Имя$i Фамилия$i")
        val pref = "+7-9"
        val tire = "-"
        val str1 = Random.nextInt(0, 9).toString()
        val str2 = Random.nextInt(0, 9).toString()
        val str3 = Random.nextInt(0, 9).toString()
        val str4 = Random.nextInt(0, 9).toString()
        val str5 = Random.nextInt(0, 9).toString()
        val str6 = Random.nextInt(0, 9).toString()
        val str7 = Random.nextInt(0, 9).toString()
        val str8 = Random.nextInt(0, 9).toString()
        val str9 = Random.nextInt(0, 9).toString()
        val str = pref + str1 + str2 + tire + str3 + str4 + str5 + tire + str6 + str7 + tire + str8 + str9
        phones.add(str)
////      Упрощенный, но более короткий вариант вида номера телефона:
//        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    println(nameSurname)
////        Выделение фамилий и объединение их с номерами телефонов
    val surname = nameSurname.map { it.substringAfter(' ') }
    val newNS = surname.zip(phones)
    for (i in newNS) {
        println("Фамилия: ${i.first} Телефон: ${i.second}")
    }
}