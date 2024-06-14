package org.soneech.introduction.task6

fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email

    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)

class PersonalInfo(val email: String?)

class Mailer {
    fun sendMessage(email: String, message: String) {
        println("send message '$message' to email '$email'")
    }
}

fun main() {
    val message = "some message"
    val email = "example@example.com"

    sendMessageToClient(Client(PersonalInfo(email)), message, Mailer())
    sendMessageToClient(Client(null), message, Mailer())
    sendMessageToClient(Client(null), null, Mailer())
    sendMessageToClient(null, null, Mailer())
    sendMessageToClient(Client(PersonalInfo(null)), message, Mailer())
    sendMessageToClient(Client(PersonalInfo(email)), null, Mailer())
}