fun main() {
    val names: Array<String> = arrayOf("pisang", "apel", "anggur")
    println(names)
    println(names.size)
    println(names.get(0))
    println(names[1])
    names.set(0, "nanas")
    println(names.get(0))
    names[0]="pisang"
    println(names.get(0))

    //null array
    val member: Array<String?> = arrayOfNulls(2)
    member.set(0, "A")
    member[1] = "B"

    println(member[0])
    println(member[1])

}