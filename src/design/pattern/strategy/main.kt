package design.pattern.strategy

// 런타임에서 전략에 따른 서비스 실행
fun main() {
    val sender: NotificationSender
    val slackMessage = NotificationMessage("SLACK ALERT", "HI SLACK", false)
    val emailMessage = NotificationMessage("EMAIL ALERT", "HI EMAIL", true)

    var notificationService = NotificationService(SlackSender())
    notificationService.notify(slackMessage)

    notificationService = NotificationService(EmailSender())
    notificationService.notify(emailMessage)
}