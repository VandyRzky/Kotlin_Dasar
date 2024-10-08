fun hello(firstName: String, lastName: String? = null){//parameter bersifat unmutable secara default
    if(lastName == null){
        println("Hello, $firstName")
    }else{
        println("Hello, $firstName $lastName")
    }
}

fun hitung(a: Int, b:Int):Int{
    return a + b
}

fun hai()= println("Hai")

fun hitung2(a: Int): Int = a*a

fun cobaVarargs(vararg values: Int ): Int{ //vararg harus parameter terakhir
    var total = 0
    for (value in values){
        total+=value
    }
    return total
}

fun String.hello2(): String { //Extension Function    
    return "Hello $this"
} 

// infix fun String.ke (type: String): String{ //infix notation
//     when(type){
//         "UP" -> {
//             return this.toUpperCase()
//         }
//         else -> return this.toLowerCase()
//     }
// }

fun faktorial(a: Int): Int{ //rekursif
    return when (a){
        1 -> 1
        else -> a * faktorial(a-1)
    }
}

fun higherOrderFunction(name: String, pengubah: (String) -> String): String{
    val nameTransform = pengubah(name)
    return "hello $nameTransform"
}

inline fun inlineFunction (name: () -> String): String{//inline function
    val panggilNama = name()
    return "hello $panggilNama"
}

fun main(args: Array<String>) {
    hello("Hero", null)
    hello(firstName = "hero", lastName = "hero2")
    println(hitung(a = 1, b =5))
    hai()
    println(hitung2(2))
    println(cobaVarargs(5,5,5,5))
    val name = "hero"
    println(name.hello2())
    // val cobaInfix = "hero" ke "UP"
    // println(cobaInfix)

    fun sayHello(){ //function scope == function dalam function
        println ("Hello")
    }
    sayHello()
    println(faktorial(4))

    val lamdaFunction: (String) -> String = { name: String -> //lamda expression
        val hasil = "Halo $name"
        hasil
    }
    println(lamdaFunction("hero"))

    val upper = {value: String -> value.toUpperCase()} //lamda
    println(higherOrderFunction("hero", upper))

    val upper1 = fun(value: String): String{ //anonymous function
        if (value == ""){
            return "error"
        }
        return value.toUpperCase()
    }
    println(higherOrderFunction("helo", upper1))


    //closure
    var counter = 1
    val lamdaCounter = {
        println(counter)
        counter ++
    }
    lamdaCounter()
    println(counter)

    println(inlineFunction({"wwwww"}))//inline function

}