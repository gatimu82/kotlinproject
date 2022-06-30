package oop

fun main(args: Array<String>) {
    var firstUser = User("simon","emobilos@gmail.com","12345","123456")
          firstUser.register()
          firstUser.login()

    var secondUser = User("xyz","emobilis@gmail.com","12345","12345")
    secondUser.register()
}
class User {
    //These are the properties
    var name:String
    var email:String
    var password:String
    var confirmPassword:String

    //This is a constructor
    constructor(name:String , email:String , password: String ,confirmPassword:String){
        this.name = name
        this.email = email
        this.password = password
        this.confirmPassword = confirmPassword
    }
    //These are functionallity

    fun register(){
        if (!password.equals(confirmPassword)){
            println("passwords dont match")
        }else{
            println("regestration successful")
    }

}
    fun login(){
    if (email.equals("emobilis@gmail.com")&&password.equals("12345")){
        println("login successful")
    }else{
        println("wrong username or password")
    }

    }
}
