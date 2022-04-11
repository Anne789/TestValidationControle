package com.example.exercice3

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test

class TDD {

    private lateinit var students : MutableList<Student>
    private lateinit var subjects : MutableList<Subject>

    @Before
    fun setup()
    {
        students = mutableListOf()
        subjects = mutableListOf()
    }

    // students
    @Test
    fun listStudents(students : MutableList<Student>) {
         for (i in 1..students.size) {
               println(i)
           }
        assertThat(students.size, equalTo(1))
    }

    @Test
    fun addStudent() {
        students.add(Student(1, "fred"))
        assertThat(students.size, equalTo(1))
    }

    @Test
    fun deleteStudent() {
        students.remove(Student(1, "fred"))
        assertThat(students.size, equalTo(0)) // Hamcrest
    }

    @Test
    fun updateStudent() {
        addStudent()
        assertThat(students.size, equalTo(1))
        val studentUpdate = students[0]
        studentUpdate.name = "test"
        assertThat(students[0].name, equalTo(("test")))

    }

    // sujects
    @Test
    fun listSchoolSubjects(sujects : MutableList<Subject>) {
        for (i in 1..sujects.size) {
            println(i)
        }
        assertThat(sujects.size, equalTo(1))
    }

    @Test
    fun addSchoolSubject() {
        subjects.add(Subject(1, "history"))
        assertThat(subjects.size, equalTo(1))
    }

    @Test
    fun deleteSchoolSubject() {
        subjects.remove(Subject(1, "history"))
        assertThat(subjects.size, equalTo(0)) // Hamcrest
    }

    @Test
    fun updateSubject() {
        addSchoolSubject()
        assertThat(subjects.size, equalTo(1))
        val subjectUpdate = subjects[0]
        subjectUpdate.name = "maths"
        assertThat(subjects[0].name, equalTo(("maths")))

    }

}

