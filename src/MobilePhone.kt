import kotlin.random.Random

class MobilePhone(osName: String, brand: String, model: String) {
    val battery = (0..50).shuffled().last()

    init {
        println("The phone $model from $brand uses $osName as its Operating System")

    }

    fun chargeBattery(b: Int) {
        println("Current battery $battery")
        var chargeBattery: Int = battery + b
        var now = 100 - chargeBattery
        println("Battery charged $chargeBattery")
        println("Battery left now $now")
    }
}