package Trains

open class Train (var start_station: String,
                  var end_station: String,
                  var time : String,
                  var date: String)
{
    open fun Hello()
    {
        println("Здравствуйте, Пассажир!")
    }
    open fun Input_Application ()
    {
        try
        {
            print("Станция отправления: ")
            start_station = readLine()!!.toString()
            print("Станция назначения: ")
            end_station = readLine()!!.toString()
            print("Время, в которое вы бы хотели отправиться: ")
            time = readLine()!!.toString()
            var proverka = time.toCharArray()
            if (proverka[0]!!.toString()!!.toInt()>=0 && proverka[0]!!.toString()!!.toInt()<3 && proverka[1]!!.toString()!!.toInt()>=0 && proverka[1]!!.toString()!!.toInt()<10)
            {
                if (proverka[3]!!.toString()!!.toInt()>=0 && proverka[3]!!.toString()!!.toInt()<6 && proverka[4]!!.toString()!!.toInt()>=0 && proverka[4]!!.toString()!!.toInt()<10) {
                    print("Дата отправления: ")
                    date = readLine()!!.toString()
                    var proverka_dd = date.toCharArray()
                        if (proverka_dd[0]!!.toString()!!.toInt()>=0 && proverka_dd[0]!!.toString()!!.toInt()<=3 && proverka_dd[1]!!.toString()!!.toInt()>=0 && proverka_dd[1]!!.toString()!!.toInt()<10)
                        {
                            if (proverka_dd[3]!!.toString()!!.toInt() >= 0 && proverka_dd[3]!!.toString()!!.toInt() < 2 && proverka_dd[4]!!.toString()!!.toInt() >= 0 && proverka_dd[4]!!.toString()!!.toInt() < 3)
                            {
                                if (proverka_dd[6]!!.toString()!!.toInt() == 2 && proverka_dd[7]!!.toString()!!.toInt() == 0 && proverka_dd[8]!!.toString()!!.toInt() >= 0 && proverka_dd[8]!!.toString()!!.toInt() < 3 && proverka_dd[9]!!.toString()!!.toInt() >= 0 && proverka_dd[9]!!.toString()!!.toInt() < 10)
                                {
                                    if (proverka_dd[8]!!.toString()!!.toInt() == 2 && proverka_dd[9]!!.toString()!!.toInt() <= 4)
                                    {
                                    }
                                    else println("Вы неправильно ввели год!")
                                }
                                else println("Вы неправильно ввели год!")
                            }
                            else println("Вы неправильно ввели месяц!")
                        }
                        else println("Вы неправильно ввели день!")
                }
                else println("Вы неправильно ввели минуты")
            }
            else println ("Вы неправильно ввели час")

        }
        catch (e : Exception)
        {
            println ("Ошибка")
        }
    }
}
