package com.chaudharynabin6.navigationincompose.data

import com.google.gson.Gson
import java.util.*

//https://www.baeldung.com/kotlin/json-convert-data-class
// problem doesn't work with special symbols so avoid this approach
data class User(
    val name: String,
    val id: Long,
) {
    companion object {
        private val gson = Gson()
        fun toUser(jsonString: String): User {
            return gson.fromJson(jsonString, User::class.java)
        }

        fun toJson(user : User): String {
            return gson.toJson(user)
        }

    }



}