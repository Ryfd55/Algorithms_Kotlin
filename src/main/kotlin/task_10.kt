import java.util.*

fun result(brick: List<Int>, hole: List<Int>) {

    val sortBrick = brick.sorted()
    val sortHole = hole.sorted()
    if (sortHole[0] >= sortBrick[0] || sortHole[1] >= sortBrick[1])
        println("Кирпич со сторонами $brick ПРОЙДЕТ сквозь отверстие со сторонами $hole")
    else
        println("Кирпич со сторонами $brick НЕ ПРОЙДЕТ сквозь отверстие со сторонами $hole")
}

class Dog {

    var name = "df"
        get() = name.lowercase(Locale.getDefault())
    var age = 4
        set(value) {
            if (value > 0)
                field = value
        }
    var weight = 0f
        set(value) {
            if (value > 0)
                field = value
        }
}
/**--------------------------------------------------------------------------------------------*/

