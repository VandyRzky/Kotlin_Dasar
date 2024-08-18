fun main(args: Array<String>) {
    //percabangan "if..else"
    var nilai = 65
    if (nilai >= 80){
        println("nice")
    }else if (nilai>=60){
        println("good")
    }else{
        println("try again")
    }
    //percabangan "when"
    var nilai2 = "C"
    when (nilai2){
        "A" -> println("nice")
        "B" -> {
            println("good")
        }
        "C" ->{
            println("Not bad")
        }
        else->{
            println("try again")
        }
    }
    when (nilai2){
        "A", "B", "C" ->{
            println("pass")
        }
        else ->{
            println("try again")
        }
    }
    val pass = arrayOf("A", "B", "C")
    when (nilai2){
        in pass -> println("lulus")
        !in pass -> println("coba lagi")
    }
    // val name = "hero"
    // when (name){
    //     is String -> println("ini string")
    //     !is String -> println("bukan string")
    // }
    when{
        (nilai > 80) -> println("good")
        (nilai > 60) -> println("nice")
        else -> println("try again")
    }
}