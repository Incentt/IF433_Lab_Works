package oop_104654_VincentWisnata.week8

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Sending email: $emailAddress")
    }
    fun processUser(user: UserProfile){

        if(user.email != null){
            sendEmail(user.email)
        }else{
            println("${user.name} tidak memiliki email")
        }
    }
}