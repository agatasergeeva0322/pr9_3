import Trains.Train as NewTrain
import Application as Cashier
fun main ()
{
    var train = NewTrain("", "", "", "")
    var applic = Cashier(0,0.0,0.0,0,  "", "","","")
    train.Hello()
    applic.Input_Application()
    applic.Hello()
    applic.Input()
    applic.InfoAboutApplication()
    applic.Way()
}
