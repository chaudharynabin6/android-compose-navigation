package com.chaudharynabin6.navigationincompose.data


data class Person(
    val name: String,
    val id: Long,
) : EntityInterface<Person> {
    //    https://simplesolution.dev/java-base32-encoding-decoding-using-apache-commons-codec/
    companion object {
        val instance = Person("", -1)
    }
}