import jdk.jshell.Snippet

fun main(args: Array<String>) {
    val phone = MobilePhone("Android", "OPPO", "OPPO")
    phone.chargeBattery(30)

    addNumbers()

}


fun addNumbers() {
    var numbers: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    var sum = 0
    for (i in numbers.indices) {
        sum += numbers[i];
    }
    print(sum / 5.toDouble())
}

