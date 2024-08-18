fun main(args: Array<String>) {
    val hasil = 10/3
    println(hasil)
    var hasil2 = 10.0/3.0
    println(hasil2)
    var hasil3 = 10+5/5
    println(hasil3)

    var hasil4 = hasil2 > hasil3
    println(hasil4)

    var hasil5 = hasil > 5
    var hasil6 = hasil3 > 3

    var pass = hasil5 && hasil6
    var pass2 = hasil6 || hasil5
    println(pass)
    println(pass2)
    println(!pass2)
}