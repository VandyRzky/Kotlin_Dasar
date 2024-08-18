//variable konstan
const val TES = "Nyoba Kotlin"


fun main(args: Array<String>) {
    //mutable
    var tes: String? = null
    tes = "mutable"
    var tes2 = 1212
    //immutable
    val immutable = "Inmmutable variable"

    println(tes)
    println(tes?.length)
    println(TES)
    println(tes2)
    println(immutable)
}