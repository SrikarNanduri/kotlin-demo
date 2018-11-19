package com.example.kotlin.demo.service

import com.example.kotlin.demo.model.User

interface UserService {
    fun getAllUsers(): List<User>
    fun getUser(name: String, surname: String): User
    fun addUser(user: User)
    fun updateUser(name: String, user: User)
    fun deleteUser(name: String)
}