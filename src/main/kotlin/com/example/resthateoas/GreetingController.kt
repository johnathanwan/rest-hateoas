package com.example.resthateoas

import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*
import org.springframework.http.*
import org.springframework.web.bind.annotation.*

@RestController
class GreetingController {

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): HttpEntity<Greeting> {
        val greeting = Greeting("Hello, $name")
        greeting.add(linkTo(methodOn(GreetingController::class.java).greeting(name)).withSelfRel())
        return ResponseEntity(greeting, HttpStatus.OK)

    }
}