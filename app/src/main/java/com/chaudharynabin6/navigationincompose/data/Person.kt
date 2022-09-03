package com.chaudharynabin6.navigationincompose.data


data class Person(
    val name: String,
    val id: Long,
) : Entity {
    //    https://simplesolution.dev/java-base32-encoding-decoding-using-apache-commons-codec/
    companion object {
        val instance = Person("", -1)
    }

    override fun toEntity(entityString: String): Person {
        return super.toEntity(entityString) as Person
    }
}