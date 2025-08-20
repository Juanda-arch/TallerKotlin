package Clases


fun main() {
    var numero = 125
    val numeros : MutableList<Int> = mutableListOf()
    while(numero>0) {
        var residuo = numero % 2
        numero = numero/2



        numeros.add(residuo)

    }
    val numeroInvertidos = numeros.reversed()
    println(numeroInvertidos)

    viceversa().run { println(this) }

}

fun viceversa(){
    val binario = "1111101"
    val decimal = binario.toInt(2)
    println(decimal)
}


