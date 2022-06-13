
/**                 task_2     ПУЗЫРЬКОВАЯ СОРТИРОВКА
 */
fun sort(oldList: MutableList<Int>): List<Int> {
    var tmp: Int
    for (j in 0 until oldList.size - 1) {
        for (i in 0 until (oldList.size - 1 - j)) {
            if (oldList[i] > oldList[i + 1]) {
                tmp = oldList[i]
                oldList[i] = oldList[i + 1]
                oldList[i + 1] = tmp
            }
        }
        println(oldList)
    }
    return oldList
}