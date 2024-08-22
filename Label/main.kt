fun labelBreak(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (i > 5){
                break@loopI
            }
            println ("$i * $j = ${i*j}")
        }
    }
}

fun labelContinue(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopJ
            }
            println ("$i * $j = ${i*j}")
        }
    }
}

fun main(args: Array<String>) {
    //labelBreak()
    labelContinue()
}