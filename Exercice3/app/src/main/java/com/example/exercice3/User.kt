package com.example.exercice3

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
open class User (val id: Int, open val name:String)  {

}

class Student(id: Int, override var name: String) : User(id, name) {

}

class Teacher(id: Int, override val name:String) : User(id, name) {

}

class Subject (id: Int, var name:String) {

}




