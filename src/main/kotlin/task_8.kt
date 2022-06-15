import kotlin.math.sqrt

fun circleInside(
    circleCenter1: List<Double>, circleCenter2: List<Double>,
    circleRadius1: Double, circleRadius2: Double
) {
    if ((sqrt(circleCenter1[0] - circleCenter2[0]) +
                sqrt(circleCenter1[1] - circleCenter2[1])) >
                sqrt(circleRadius1 - circleRadius2)
    )
        println("Нет, окружность не лежит внутри другой")
    else if (circleRadius1 > circleRadius2)
        println("Окружность_2 находится в нутри Окружности_1")
    else
        println("Окружность_1 находится в нутри Окружности_2")
}


