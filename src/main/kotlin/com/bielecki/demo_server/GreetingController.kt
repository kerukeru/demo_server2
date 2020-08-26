package com.bielecki.demo_server

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * obsluguje GET - jak jakis serwis wywola get na
 * localhost/greeting to dostanie to co tu w returnie
 */
@RestController
class GreetingController {

    private val counter2 = Int

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String?): Greeting? {
        return Greeting(counter2)
    }
}