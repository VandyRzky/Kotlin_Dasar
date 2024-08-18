fun main(args: Array<String>) {
    //for
    var cari = "apel"
    var idxnames = 0
    val names: Array<String> = arrayOf("pisang", "apel", "anggur")
    for (name in names){
        if (cari == name){
            println("Data ketemu")
            println("Data terletak pada indeks ke-$idxnames")
        }else{
            idxnames++
        }
    }
    val panjangNames = names.size -1
    for (value in 0..panjangNames){
        println(names[value])
    }
    //while
    var i =0
    while (i<10){
        println("$i while loop")
        i++
        if (i == 5){
            println("perulangan selesai")
            break
        }
    }
    var j = 0
    do{
        println("j ke-$j")
        j++
    }while(j<10)

    for(k in 1..14){
        if (k%2 ==0){
            continue
        }
        println(k)
    }
}