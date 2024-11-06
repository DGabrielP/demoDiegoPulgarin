package com.example.demo.controller

import jakarta.websocket.server.PathParam
import com.example.demo.model.Model
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/home")
class HomeController {

    /*@GetMapping("/{id}")

    fun home(@PathVariable("id") id: Int): String {
        return "Hello, World $id"
    }*/

    /*@GetMapping()

    fun home(@PathParam("id") id: Int): String {
        return "Hello, World $id"
    }*/

    @GetMapping()

    fun home(@RequestBody model:Model): String {
        return "Hello, World ${model.id} ${model.name} ${model.age}"
    }

}