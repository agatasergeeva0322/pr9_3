package Trains

open class Train (var station: String,
                  var time : String,
                  var date: String)
{
    open fun Input_Application ()
    {
        try
        {
            print("Станция назначения: ")
            station = readLine()!!.toString()
            print("Время, в которое вы бы хотели отправиться: ")
            time = readLine()!!.toString()
            var proverka = time.toCharArray()
            if (proverka[0]!!.toString()!!.toInt()>=0 && proverka[0]!!.toString()!!.toInt()<3 && proverka[1]!!.toString()!!.toInt()>=0 && proverka[1]!!.toString()!!.toInt()<10)
            {
                if (proverka[3]!!.toString()!!.toInt()>=0 && proverka[3]!!.toString()!!.toInt()<6 && proverka[4]!!.toString()!!.toInt()>=0 && proverka[4]!!.toString()!!.toInt()<10) {
                    print("Дата отправления:: ")
                    date = readLine()!!.toString()
                }
                else println("Вы неправильно ввели минуты")
            }
            else println ("Вы неправильно ввели час")

        }
        catch (e : Exception)
        {
            println ("Ошибка")
        }

        fun Output_Application()
        {
            println("танция назначения: ${station}\nЖелаемое время начало поездки: ${time}\nДата:${date}")
        }
    }
}