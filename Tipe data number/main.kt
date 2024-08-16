fun main(args: Array<String>) {
    var age: Byte = 30
    var height: Int = 150
    var distance: Short = 1500
    var balance: Long = 100_000_000L

    var farenheit: Float = 12.12F
    var radius: Double = 12.1212121 

    //literal
    var hexadecimal: Int = 0xCC //tambah 0x sebelum angka
    var biner: Int = 0b01 //tambah 0b sebelum angka

    println(age)
    println(height)
    println(distance)
    println(balance)

    println(farenheit)
    println(radius)

    println(hexadecimal)
    println(biner)

    //konversi
    var number: Int = 100;

    var sort: Short = number.toShort()
    var double: Double = number.toDouble()

    println(sort)
    println(double)
}