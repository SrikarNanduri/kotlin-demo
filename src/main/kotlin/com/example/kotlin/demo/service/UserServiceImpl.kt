package com.example.kotlin.demo.service

import com.example.kotlin.demo.model.User
import org.springframework.stereotype.Service
import java.util.*
import mu.KotlinLogging

@Suppress("DEPRECATION")
@Service
class UserServiceImpl: UserService {
    private val log = KotlinLogging.logger {}
    override fun getUser(name: String, surname: String) =
            User(1, name, surname, Date("2000/02/23"))

    override fun getAllUsers(): List<User> {
        var userList = listOf<User>( User(1, "Vinay", "Mittal", Date("2000/02/23")),  User(2, "Rahul", "Gupta", Date("2000/02/23")),  User(3, "Kartik", "Nanduri", Date("2000/02/23")))
            return userList
    }

    override fun addUser(user: User) =
            log.info("${user.name},added!!!")

    override fun updateUser(name: String, user: User) =
            log.info("$name,updated!!!")

    override fun deleteUser(name: String) =
            log.info("$name,deleted!!!")
}