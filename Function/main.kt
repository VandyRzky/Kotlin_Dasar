fun hello(firstName: String, lastName: String?){//parameter bersifat unmutable secara default
    if(lastName == null){
        println("Hello, $firstName")
    }else{
        println("Hello, $firstName $lastName")
    }
}
fun main(args: Array<String>) {
    hello("Hero", null)
}