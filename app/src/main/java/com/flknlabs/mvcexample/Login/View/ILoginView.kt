package com.flknlabs.mvcexample.Login.View

interface ILoginView {
    fun OnLoginSuccess(message: String?)
    fun OnLoginError(message: String?)
}