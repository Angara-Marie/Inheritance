fun main(){
    var toyota = Car("Toyota", "Noah", "Silver", 7)
    toyota.carry(9)
    toyota.identity()
    toyota.calculateParkingFees(3)
    var suzuki = Bus("Suzuki", "Minibus", "Maroon", 8)
    suzuki.maxTripFare(50.00)
    suzuki.calculateParkingFees(6)

}
 open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people: Int){
        var x = people
        x-= capacity

        if (people <= capacity){
            println("Carrying $people passengers")
        } else

            println("Overcapacity by $x people")
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var hourlyFee = 20
        var totalFees= hours*hourlyFee
        println(totalFees)
        return totalFees
    }
}
class Bus( make: String, model: String, color: String,capacity: Int):Car(make, model, color, capacity){
    fun maxTripFare(fare: Double): Double{
        var y = fare
        var maximumFare = y * capacity
        println(maximumFare)
        return maximumFare
    }

   override fun calculateParkingFees(hours: Int): Int {
       //return super.calculateParkingFees(hours)
       var z = hours * capacity
       println(z)
       return z

   }
}