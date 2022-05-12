package com.alibaba.fastjson2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class JSONTest {

    @Test
    fun test_parseObject1() {
        val text = """{"id":1,"name":"kraity"}"""
        val data = text.to<User>()

        assertEquals(1, data.id)
        assertEquals("kraity", data.name)
        assertEquals("""{"id":1,"name":"kraity"}""", data.toJSONString())
    }

    @Test
    fun test_parseObject2() {
        val user = """{"id":1,"name":"kraity"}""".parseObject<User>()

        assertEquals(1, user.id)
        assertEquals("kraity", user.name)
        assertEquals("""{"id":1,"name":"kraity"}""", user.toJSONString())
    }

    @Test
    fun test_parseObject3() {
        // JSONObject
        val user = """{"id":1,"name":"kraity"}""".parseObject()

        assertEquals(1, user.get("id"))
        assertEquals("kraity", user.get("name"))
    }

    @Test
    fun test_parseArray1() {
        // JSONArray
        val data = """[0,"1",true]""".parseArray()

        assertEquals(0, data[0])
        assertEquals("1", data[1])
        assertEquals(true, data[2])
    }

    @Test
    fun test_parseArray2() {
        val list = """[{"id":1,"name":"kraity"}]""".parseArray<User>()

        assertEquals(1, list.size)
        val user = list[0]

        assertEquals(1, user.id)
        assertEquals("kraity", user.name)
        assertEquals("""{"id":1,"name":"kraity"}""", user.toJSONString())
    }

    data class User(
        val id: Int,
        val name: String
    )
}