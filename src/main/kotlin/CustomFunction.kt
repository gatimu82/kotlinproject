fun main(args: Array<String>) {
motto()
    avg( x=455, y= 600.0, z= 645.0f)
    println(addition(X=300,y=400.0))
    login("simon")
    login("simon@gmail.com", "simon123")
}
fun motto(){
    println("Hello, this is our motto")
}

fun avg(x:Int, y:Double,z:Float){
    var average = (x + y + z) /3.0
    println("Hello,your average is $average")
}
fun addition (X:Int , y: Double):Double{
    var answer = X + y
    return answer

}
fun login(name:String){
    println("your name $name")
}
fun login(email:String , password:String){
    println("Your email is $email and your password is $password")
}
