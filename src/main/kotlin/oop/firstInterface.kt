package oop

fun main(args: Array<String>) {
    var firstschool = school()
    firstschool.orderGoods()
    println(firstschool.login())
}

interface firstInterface {
    var age:Int
    fun login():String
    fun orderGoods(){
        println("Yeah, we order goods every week")
    }
}

class school:firstInterface{
    override var age: Int =110
    override fun login(): String {
     var loginMessage = "Hello ,you can login"
        return loginMessage
    }

}