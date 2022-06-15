import kotlin.math.pow

fun circleInside(
    circleCenter1: List<Double>, circleCenter2: List<Double>,
    circleRadius1: Double, circleRadius2: Double
) {
    if (((circleCenter1[0] - circleCenter2[0]).pow(2) +
                (circleCenter1[1] - circleCenter2[1]).pow(2)) >
        (circleRadius1 - circleRadius2).pow(2)
    )
        println("Нет, окружность не лежит внутри другой")
    else if (circleRadius1 > circleRadius2)
        println("Окружность_2 находится в нутри Окружности_1")
    else
        println("Окружность_1 находится в нутри Окружности_2")
}


