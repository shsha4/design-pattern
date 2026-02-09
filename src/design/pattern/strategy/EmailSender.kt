package design.pattern.strategy

// Email 전송 전략 이메일 알림 발송 구현체
class EmailSender : NotificationSender {
    override fun send(message: NotificationMessage) {
        if (message.isAlert) {
            println("[EMAIL][ALERT] ${message.title} - ${message.body}")
        } else {
            println("[EMAIL] ${message.title} - ${message.body}")
        }
    }
}