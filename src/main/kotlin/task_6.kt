fun printInfo6(data: Map<String, List<Int>>) {

    val averageInWeek = data.flatMap { it.value }.filter { it > 0 }.average()
    println("Средняя выручка в неделю: $averageInWeek")

    val validMonths = data.filter { it.value.all { it > 0 } }

    val summPerMonth = validMonths.map { it.value.sum() }.average()
    println("Средняя выручка в месяц: $summPerMonth")

    val maxPerMonth = validMonths.maxOf { it.value.sum() }
    println("Максимальная выручка за месяц: $maxPerMonth")

    val monthOfMax = validMonths.filter { it.value.sum() == maxPerMonth }.keys
    print("Месяц максимальной выручки: ")
    for (month in monthOfMax) {
        print("$month ")
    }

    val minPerMonth = data.filter { it.value.all { it > 0 } }.minOf { it.value.sum() }
    println("\nМинимальная выручка за месяц: $minPerMonth")

    val monthOfMin = data.filter { it.value.all { it > 0 } }.filter { it.value.sum() == minPerMonth }.keys
    print("Была в следующих месяцах>: ")
    for (month in monthOfMin) {
        print("$month ")
    }

    val errorMonth = data.filterNot { it.value.all { it > 0 } }.keys
    print("\nМесяцы с ошибками данных: ")
    for (month in errorMonth) {
        print("$month ")
    }
}