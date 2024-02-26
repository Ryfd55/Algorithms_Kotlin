import kotlin.math.exp
import kotlin.random.Random

fun main() {

/**---------------------------------------------------------------------------------------------
    TASK_21     Уникальность цифр

     * Вывести ближайший номер года (от 1000 до 9000), который строго больше заданного
     * и в котором все цифры различны
     */
    val n = 1987
    println(differentNumbers(n))
}
/**---------------------------------------------------------------------------------------------
TASK_20     Порядок цифр

* Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431
*/
//    val n = 13478
//    println(revert(n))
//}
/**---------------------------------------------------------------------------------------------
TASK_19     Взаимно простые числа
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
//    val m = 101
//    val n = 10
//    println(isCoPrime(m,n))
//}
/**---------------------------------------------------------------------------------------------
TASK_18     Гипотеза Коллатца

 *  Рекуррентная последовательность чисел задана следующим образом:
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
//    val x = -46
//    println(collatzSteps(x))
//}
/**---------------------------------------------------------------------------------------------
TASK_17     Максимаьный делитель

 * Для заданного числа n > 1 найти максимальный делитель, превышающий 1
 */
//    val n = 60
//    println(maxDivisor(n))
//}
/**---------------------------------------------------------------------------------------------
TASK_16     Числа Фибоначчи

 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
//    val n = 10
//    val res = fib(n)
//    println(res)
//    }
/**---------------------------------------------------------------------------------------------
TASK_15     Совершенные числа

Найти количество цифр в заданном числе n.
Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 */
//    val n:Long = 333878345633
//    val m:Long = 3
//    println(digitCountInNumber(n, m))
//    }
/**---------------------------------------------------------------------------------------------
TASK_14     Совершенные числа

Проверка числа на совершенность -- результат true, если число совершенное
 */
//    val n = 69
//    println( isPerfect(n))
//    }
/**---------------------------------------------------------------------------------------------
TASK_13     Простые числа

Проверка числа на простоту -- результат true, если число простое
 */
//    val n = 7
//    println(isSimple(n))
//    }
/**---------------------------------------------------------------------------------------------
TASK_12     Факториал

Вычислить факториал
 */
//    val n = 5
//    factorial(n)
//    }
/**---------------------------------------------------------------------------------------------
TASK_11     Методы

Создать класс Работник, конструктор которого содержит обязательные поля: имя,
должность и год устройства на работу.
Добавить метод "работать", который выводит на экран строку "Работаю...".
Добавить свойство "Стаж"
В файле main создать extention-функцию, которая выводит всю информацию о работнике
 */
//      val worker = Worker("Jim", "director", 2011)
//      worker.printInfo()
//      }
//      fun Worker.printInfo() {
//      println("Имя $name1, должность $post, стаж работы $exp лет")
//      }
/**---------------------------------------------------------------------------------------------
TASK_10     Logical

Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
Стороны отверстия должны быть параллельны граням кирпича.
Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
Вернуть true, если кирпич пройдёт
 */
//    val brick = mutableListOf(10, 25, 12)
//    val hole = listOf(14, 15)
//    result(brick, hole)
//    }
/**---------------------------------------------------------------------------------------------
TASK_9    Logical

Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
Определить, счастливое ли заданное число, вернуть true, если это так.
 */
//    var n = 120
//    printInfo9(n)
//    }
/**---------------------------------------------------------------------------------------------
TASK_8     Logical

Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
окружности с центром в (x2, y2) и радиусом r2
 */
//    val circleCenter1 = listOf(2.0, 5.0)
//    val circleRadius1 = 5.6
//    val circleCenter2 = listOf(6.5, 8.0)
//    val circleRadius2 = 25.8
//    circleInside(circleCenter1,circleCenter2,circleRadius1,circleRadius2)
//    }
/**---------------------------------------------------------------------------------------------
TASK_7     Простые числа

Вывести все простые числа до заданного значения
 */
//    val n =255
//    printInfo7(n)
//    }
/**---------------------------------------------------------------------------------------------
TASK_6     MAP

Создать объект Map, в котором хранятся значения еженедельной выручки за разные месяцы,
значение - массив чисел (выручка за каждую неделю).
В некоторых месяцах намеренно допустите ошибку (отрицательная выручка)
Создайте метод printInfo(data: Map<String, List<Int>>),
который создает отчет и выводит его в консоль:
а) средняя выручка в неделю
б) средняя выручка в месяц
в) максимальная выручка в месяц
г) в каком месяце
д) минимальная выручка в месяц
е) в каком месяце
ж) в каких месяцах ошибки
 */
//    val data = mapOf(
//        "Январь" to listOf(100, 100, 100, 100),
//        "Февраль" to listOf(200, 200, -100, 200),
//        "Март" to listOf(300, 180, 300, 100),
//        "Апрель" to listOf(250, -250, 100, 300),
//        "Май" to listOf(200, 100, 400, 300),
//        "Июнь" to listOf(200, 100, 300, 300)
//    )
//    printInfo6 (data)
//    }
/**---------------------------------------------------------------------------------------------
TASK_5     Разделение и объединение массивов (zip)

Создать массив с Фамилиями и именами
Создать массив с телефонными номерами
Образовать новый массив с фамилиями и номерами телефонов (без имен)
 */
//    printInfo5()
//    }
/**---------------------------------------------------------------------------------------------
TASK_4     Бесконечная последовательность + take
 */
//    val array = generateSequence(1) { it + 1 }
//    val list = array.take(100).map { "Сотрудник №$it" }
//    for (i in list)
//        println(i)
//        }
/**---------------------------------------------------------------------------------------------
TASK_3     MAP метод
 */
//    printInfo3()
//    }
/**---------------------------------------------------------------------------------------------
TASK_2     ПУЗЫРЬКОВАЯ СОРТИРОВКА
 */
//    var oldList = mutableListOf(232, 34, 45, 3, 35, 2)
//    val res = sort(oldList)
//    println(res)
//    }
/**---------------------------------------------------------------------------------------------
TASK_1     FILTER метод
 */
//    val listOfNames = mutableListOf("Alex", "Bob", "Antony")
//    val listOfANames = listOfNames.filter { it.first() == 'A' }
//    println(listOfANames)
//    }
/**--------------------------------------------------------------------------------------------*/

