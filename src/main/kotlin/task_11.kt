import java.util.*

class Worker(val name1: String, val post: String, val year: Int){

    val exp: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - year

    fun work (){

        println("работаю")
    }
}