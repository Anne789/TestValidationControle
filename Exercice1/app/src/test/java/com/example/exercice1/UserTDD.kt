package com.example.exercice1

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert
import org.junit.Before
import org.junit.Test

private val a = 3
private val b = 2
//+ age
class UserTDD {

    private lateinit var users : MutableList<User>

    @Before
    fun setup()
    {
        users = mutableListOf()
    }

    @Test
    fun addUser() {
        users.add(User(1, "fred", 25))
        Assert.assertEquals(1, users.size)
    }

    @Test
    fun deleteUser() {
        users.remove(User(1, "fred", 25))
        Assert.assertEquals(0, users.size)
    }

    @Test
    fun updateUser() {
        addUser()
        Assert.assertEquals(1, users.size)
        val userUpdate = users[0]
        userUpdate.name = "test"
        Assert.assertEquals("test", users[0].name)

        userUpdate.age = 24
        Assert.assertEquals(24, users[0].age)

    }

}

