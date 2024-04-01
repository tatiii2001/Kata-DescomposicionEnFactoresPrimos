package com.kata

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldContainInOrder

/*
*   Return the decomposition of the prime factors of the given number
 */
class PrimeFactorizationShould : DescribeSpec({

    describe("Return the decomposition of prime factors"){
        it("number 24"){
            val descomposition = Descomposition()

            val result = descomposition.primeFactors(24)

            result.shouldContainInOrder(1, 2, 2, 2, 3)
        }
        it("number 500"){
            val descomposition = Descomposition()

            val result = descomposition.primeFactors(500)

            result.shouldContainInOrder(1,2,2,5,5,5)
        }
        it("number 70"){
            val descomposition = Descomposition()

            val result = descomposition.primeFactors(70)

            result.shouldContainInOrder(1,2,5,7)
        }
        it("number 12588"){
            val descomposition = Descomposition()

            val result = descomposition.primeFactors(12588)

            result.shouldContainInOrder(1,2,2,3,1049)
        }
    }

})