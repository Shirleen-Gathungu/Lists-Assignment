
fun main(){
    var words=printStrings(listOf("Maya","Zory","Ben","Jack","Lily","Dory"))
    var numbers=printHeight(listOf(50.5,60.8,75.3,80.0,62.2,55.5,65.7))
    println(numbers)
    var human=person("Joana",23,50.4,155.6)
    var human2=person("Helena",21,60.8,199.2)
    var human3=person("Gracie",20,70.1,150.2)
    var human4=person("Julian",19,57.3,150.4)
    var myPeople= listOf(human,human2,human3,human4)
    var sortedPeople=myPeople.sortedByDescending { human -> human.age}
        println(sortedPeople)



var wheels=Car("KDB9089",120)
    var wheels2=Car("KCA6709",110)
    var wheels3=Car("KCG8090",100)
    var wheels4=Car("KCB5040",90)
    var myCars=listOf(wheels,wheels2,wheels3,wheels4)
    println(myCars)

    var morePeople =(mutableListOf((person("Nordojie",19,53.6,158.2))
        ,person("Mariana",23,66.8,167.0)
                people.addAll(addPeople)
                println(morePeople)
                addPeopleToList()

}





fun printStrings(names:List<String>){
    names.forEachIndexed{index,name->
        if(index%2==0)
            println(name)

    }
}


fun printHeight(nums:List<Double>):Double{
    return nums.average()
    return nums.sum()

}
data class person(var name:String,var age:Int,var weight:Double,var height:Double){
    fun addPeopletoList () {
        var people = mutableListOf<person>()
        people.addAll(mutableListOf( person("Nordojie",19,53.6,158.2),
            person("Mariana",23,66.8,167.0)))
    }
}

data class Car(var registration:String,var mileage:Int){
    fun getAverage (avgmileage:List<Car>): Double{
        var sum = 0.0
        avgmileage.forEach { car ->
            sum+=car.mileage


        }
        var average = sum/avgmileage.count()
        return average

    }




}

