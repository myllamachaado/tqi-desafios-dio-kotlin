package desafios

fun main() {
        val media = readLine()!!.toDouble();

        when {
            media < 5 -> println("REP");
            media < 7 -> println("REC")
            else -> println("APR")
        }
    }
