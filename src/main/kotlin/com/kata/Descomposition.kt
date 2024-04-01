package com.kata

class Descomposition() {
    fun primeFactors(parameter : Int): List<Int> {

        var number = parameter
        val list = mutableListOf(1)
        var primeNumber = 2

        do{
            if(number%primeNumber == 0){
                list.add(primeNumber)
                number /= primeNumber
            }else{
                primeNumber++
            }
        }while (number != 1)

        return list.toList()
    }

}
