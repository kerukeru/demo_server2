package com.bielecki.demo_server

class Greeting(counter2: Int.Companion) {
    private var id: Int = 16
    private var content: String? = null

    fun Greeting(id: Int) {
        this.id = id
    }

    fun getId(): Int {
        return id
    }

    fun getContent(): String? {
        return content
    }
}