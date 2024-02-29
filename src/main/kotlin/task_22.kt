fun level(n: Int): String {
    val startPart = "I"
    val endPart = " it"
    val middlePart = " that I"
    var resString: String = startPart
    val unevenLevel = " hate"
    val evenLevel = " love"

    for (i in 1..n) {
        if (i % 2 != 0) resString += unevenLevel
        else resString += evenLevel
        if (i != n) resString += middlePart
    }
    resString += endPart
    return resString
}