package com.example.exercice2

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.junit.Assert
import org.junit.Test

private val a = 3
private val b = 2

class CalculTDD {
    @Test
    fun calculAdd() {
        val calcul = Calcul()
        val result: Int = calcul.add(a, b)
        MatcherAssert.assertThat(5, equalTo(result))
    }

    @Test
    fun calculSub() {
        val calcul = Calcul()
        val result: Int = calcul.sub(a, b)
        MatcherAssert.assertThat(1, equalTo(result))
    }

    @Test
    fun calculDiv() {
        val calcul = Calcul()
        val result: Int = calcul.div(a, b)
        MatcherAssert.assertThat(3/2, equalTo(result))
    }

    @Test
    fun calculMult() {
        val calcul = Calcul()
        val result: Int = calcul.mult(a, b)
        MatcherAssert.assertThat(6, equalTo(result))
    }

}

