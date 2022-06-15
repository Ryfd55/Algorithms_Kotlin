fun result(brick: List<Int>, hole: List<Int>) {

    val sortBrick = brick.sorted()
    val sortHole = hole.sorted()
    if (sortHole[0] >= sortBrick[0] || sortHole[1] >= sortBrick[1])
        println("Кирпич со сторонами $brick ПРОЙДЕТ сквозь отверстие сос торонами $hole")
    else
        println("Кирпич со сторонами $brick НЕ ПРОЙДЕТ сквозь отверстие сос торонами $hole")
}