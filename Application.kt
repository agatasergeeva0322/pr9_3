import Trains.*

class Application ( var kol: Int, var time_ : Double, var cost: Double, var count: Int, empStart_station: String, empEnd_station: String,empTime : String, empDate : String): Train (empStart_station, empEnd_station, empTime , empDate)
{
    override fun Hello()
    {
        println("\nЗдравствуйте, Кассир!")
    }

    var interval_p = ""
    var interval: List<String> = listOf()
    var timeofway: List<Double> = listOf()
    var money: List<String> = listOf()

    fun Input () {
        try {
            print("Введите количество маршрутов, подходящих человеку: ")
            kol = readLine()!!.toInt()
            if (kol>0) {
                for (j in 0..(kol-1)) {
                    print("\nКоличество станций в ${j+1}-м маршруте: ")
                    count = readLine()!!.toInt()
                    for (i in 0..(count - 3)) {
                        print("Промежуточная станция №${i+1}: ")
                        interval_p += readLine()!!.toString() + "\n"
                    }
                    print("Время в пути (в минутах): ")
                    time_ = readLine()!!.toDouble()
                    if (time_>0) {
                        print("Стоимость поездки: ")
                        cost = readLine()!!.toDouble()
                        if (cost>0) {
                            interval += interval_p
                            timeofway += time_
                            money += cost.toString()
                            interval_p = ""
                        }
                        else println ("Стоимость может быть отрицательным!")
                    }
                    else println ("Время не может быть отрицательным!")
                }
            }
            else println ("Количество маршрутов не может быть отрицательным или нулевым!")


        } catch (e: Exception) {
            println("Ошибка")
        }
    }
    fun InfoAboutApplication()
    {
        println(date)
        println("Ваша начальная станция: ${start_station}\nВот варианты поездов:")
        for (j in 0..kol-1) {
            println("${j+1} МАРШРУТ\nНачальная станция: ${start_station}")
            println("Промежуточные станции: \n${interval[j] }")
            print("Конечная станция: ${end_station}")
            println("Время в пути: ${timeofway[j]}\nЦена: ${money[j]}")
            println("-----------------------")
        }
    }
    fun Way()
    {
        print("Введите номер маршрута, который вам подходит. Если нет подходящего, то нажмите 0:  ")
        var numb = readLine()!!.toInt()
        if (numb>-1 && numb<=kol)
        {
            if (numb ==0) println("Мы сожалеем, что у нас не нашлось подходящего поезда для вас в выбранную дату! Попробуйте посмотреть маршруты на другой день!")
            else println("Отлично! Мы забронировали для вас место в поезде! Оплатите свой билет не позднее, чем за 20 минут до отравления, инче бронь будет снята!")
        }
        else println("Нет машрута с таким номером!")
    }
}
