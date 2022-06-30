package oop

fun main(args: Array<String>) {
    var firstBoardmember = Boardmember("Simon", 100)
    firstBoardmember.viewResults()

    var firststudent = student ("Consolata",105)
    firststudent.publishMagazine()
}

 open class Teacher(open var name:String, open var age:Int) {
    fun viewResults(){
        println("Hello $name, you can view results")
    }
    fun publishMagazine(){
        println("yeah,you can publish a magazine at $age years old")
    }
}

open class Boardmember (name: String,age: Int):Teacher(name, age){

}
class student(name:String ,age: Int):Boardmember(name, age){
    fun login(){
        println("Yeah i can login")
    }
}