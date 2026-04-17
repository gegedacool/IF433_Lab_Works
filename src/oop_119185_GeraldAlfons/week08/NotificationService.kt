package oop_119185_GeraldAlfons.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke $emailAddress")
    }

    fun processUser(userProfile: UserProfile) {
        if (user.email != null) {
            sendEmail(user.email)
        } else
            println("User ${user.name} tidak memiliki email")
    }
}
