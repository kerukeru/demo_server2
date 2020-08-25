package com.bielecki.demo_server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    private val template = "Hello, %s!"
    private val counter = AtomicLong()
    private val counter2 = Int

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String?): Greeting? {
        return Greeting(counter2)
        //return Greeting(counter2, String.format(template, name))
    }
}