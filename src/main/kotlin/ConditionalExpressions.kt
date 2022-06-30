fun main(args: Array<String>) {
    var marks = 90
    var grade = if (marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks < 70){
        "C"
    }else if (marks < 80){
        "B"
    }else{
        "A"
    }
    println(grade)

    var bettingNumber = 0
    var bettingResult = when(bettingNumber){
        1->{
            "oops!!! you lost"
        }
        2->{
            "congrats you won"
        }
        3->{
            "oops!!! you lost"
        }
        else->{
            "please enter a number between 1-3 to bet"
        }
    }
    println(bettingResult)
}