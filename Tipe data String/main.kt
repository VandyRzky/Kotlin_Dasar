fun main(args: Array<String>) {
    var string1: String = "Hello"
    var manyLineString: String = """Test    
Hello"""
    var manyLineString2: String = """
    >Hello
    >World""".trimMargin(">")
    println(string1)
    println(manyLineString)
    println(manyLineString2)

    var first: String = "Hero1"
    var last: String = "Hero2"
    var full: String = "$first $last"

    println(full)
}