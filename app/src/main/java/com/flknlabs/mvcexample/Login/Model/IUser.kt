package com.flknlabs.mvcexample.Login.Model

interface IUser {
    fun getEmail(): String?
    fun getPassword(): String?
    fun isValid(): Int
}