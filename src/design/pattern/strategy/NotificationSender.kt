package design.pattern.strategy

// 알림을 어떻게 보낼 것인지에 대한 전략
// 추상화를 통해 확장
interface NotificationSender {
    // 메세지를 전송 한다
    fun send(message : NotificationMessage)
}