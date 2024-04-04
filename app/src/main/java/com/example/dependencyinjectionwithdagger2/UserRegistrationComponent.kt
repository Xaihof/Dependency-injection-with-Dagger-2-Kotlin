package com.example.dependencyinjectionwithdagger2

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService(): EmailService

}