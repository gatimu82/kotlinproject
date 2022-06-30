package oop

fun main(args: Array<String>) {
    var firstAdmin = Admin("Simon",90000.00,"simon@gmail.com")
    firstAdmin.registration()
    println(firstAdmin.salary)
    firstAdmin.setidNumber("22116604")
    println(firstAdmin.getidNumber())
}

class Admin {
    var name:String
    var salary:Double
    var email:String
   private var phoneNumber:String =" "
   private var idNumber:String = ""

    constructor(name:String, salary:Double, email:String){
        this.name = name
        this.salary = salary
        this.email = email
    }
    fun registration(){
        println("Yeah, I can register a user")
    }
    fun suspendingEmployee(){
        println("Yeah, I can suspend an employee")
    }
    fun setPhoneNumber (PhoneNumber:String){
        this.phoneNumber = phoneNumber
    }
    fun getPhoneNumber(): String{
        return this.phoneNumber

     }
    fun setidNumber (idNumber:String){
        this.idNumber = idNumber
    }
    fun getidNumber():String{
       return this.idNumber
        }
    }