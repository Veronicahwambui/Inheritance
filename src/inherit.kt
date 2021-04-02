fun main() {
    var gari = Car("subaru", "legancy", "white", 5)
    gari.carry(10)
    println(gari.capacity)
    gari.Identity()
    println(gari.parkingFees(6))
    var toyota=Bus("plado","legancy","red",7)
    println(toyota.maxTripFare(60.33))
    println(toyota.parkingFees(7))
}
open class Car ( var make:String, var model:String,var colour:String,var capacity:Int){
    fun carry(people: Int) {
        if (capacity<= people) {
            println("Carrying $people  passagers")
        } else if (capacity > people) {
            var exceed = people - capacity
            println("over capacity $people  passangers")
        }
    }
        fun Identity() {
            println("Iam a $colour  $make  $model")
        }
    open fun parkingFees(hours: Int): Int {
        var parkfees = hours * 20
            return parkfees
        }
    }
class Bus(make:String,  model:String,colour:String, capacity:Int):Car(make,model,colour,capacity){
    fun maxTripFare(fare:Double):Double{
        return fare * capacity
    }
    override fun parkingFees(hours: Int): Int {
        return hours* capacity
    }
}



