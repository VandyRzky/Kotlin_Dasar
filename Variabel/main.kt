//variable konstan
const val TES = "Nyoba Kotlin"


fun main(args: Array<String>) {
    //mutable
    var tes: String? = null
    tes = "mutable"
    //immutable
    var tes2 = 1212
    val immutable = "Inmmutable variable"

    println(tes)
    println(tes?.length)
    println(TES)
    println(tes2)
    println(immutable)
}