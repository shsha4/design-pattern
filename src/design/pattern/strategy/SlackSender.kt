package design.pattern.strategy

// 슬랙 알림 전송 전략
class SlackSender : NotificationSender {
    override fun send(message: NotificationMessage) {
        if (message.isAlert) {
            println("[SLACK][ALERT] ${message.title} - ${message.body}")
        } else {
            println("[SLACK] ${message.title} - ${message.body}")
        }
    }
}