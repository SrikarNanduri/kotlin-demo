package com.example.kotlin.demo.controller

import com.example.kotlin.demo.model.User
import com.example.kotlin.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController() {

    @Autowired
    lateinit var userService: UserService


    @GetMapping("/users")
    fun getUser(@RequestParam(value = "name") name: String, @RequestParam(value = "surname") surname: String) =
            userService.getUser(name, surname)


    @GetMapping("/users/")
    fun getAllUsers() = userService.getAllUsers()

    @PostMapping("/users")
    fun addUser(@RequestBody user: User) =
            userService.addUser(user)


    @PutMapping("/users")
    fun updateUser(@RequestParam(value = "name") name: String, @RequestBody user: User) =
            userService.updateUser(name, user)


    @DeleteMapping("/users")
    fun deleteUser(@RequestParam(value = "name") name: String) =
            userService.deleteUser(name)
}