import kotlin.math.pow

fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) {

    if (((x - x0).pow(2) + (y - y0).pow(2)) <= r.pow(2))
        println("Да, точка ($x, $y) лежит внутри окружности с центром в ($x0, $y0) и радиусом $r")
    else
        println("Нет, точка ($x, $y) не лежит внутри окружности с центром в ($x0, $y0) и радиусом $r")
}