import Trains.*

    class Puple ( var kol: Int, var station_start : String, var count: Int,var station_end: String, empStation: String, empTime : String, empDate : String): Train (empStation, empTime , empDate)
    {
        var interval_p = ""
        var station_p: Array<String> = arrayOf()
        var start: Array<String> = arrayOf()
        var interval: Array<String> = arrayOf()
        var end: Array<String> = arrayOf()

         fun Input () {
             try {
                 print("Введите маршрутов, подходящих человеку: ")
                 kol = readLine()!!.toInt()
                 if (kol>0) {

                     for (j in 0..kol) {
                         print("Количество станций в маршруте: ")
                         count = readLine()!!.toInt()
                         print("Начальная станция: ")
                         station_start = readLine()!!.toString()
                         var i = 0
                         for (i in 0..count - 2) {
                             station_p[i] = readLine()!!.toString()
                             interval_p = station_p[i] + "\n"
                         }
                         print("Конечная станция: ")
                         station_end = readLine()!!.toString()
                         start[j] = station_start
                         interval[j] = interval_p
                         end[j] = station_end
                     }
                 }
                 else println ("Количество маршрутов не может быть отрицательным или нулевым!")


             } catch (e: Exception) {
                 println("Ошибка")
             }
         }


    }

