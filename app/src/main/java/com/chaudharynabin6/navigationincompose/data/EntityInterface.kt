@file:Suppress("UNCHECKED_CAST")

package com.chaudharynabin6.navigationincompose.data

import com.google.gson.Gson
import org.apache.commons.codec.binary.Base32

interface EntityInterface<T> {

    companion object {
        private val base32 = Base32()
        private val gson = Gson()
    }

    fun toBase32(): String {
        val personString = gson.toJson(this).encodeToByteArray()
        return base32.encodeToString(personString)
    }

    fun toEntity(entityString: String): T {
        val decodeString = base32.decode(entityString).decodeToString()
        return gson.fromJson(decodeString, this::class.java) as T
    }
}