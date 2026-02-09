package design.pattern.strategy

class NotificationService(
    // 다형성으로 실제 구현첵가 뭔지 몰라도 됨
    // 인터페이스로 send 만 사용하면 되기때문
    private val sender : NotificationSender
) {
    fun notify(message: NotificationMessage) {
        // slack 인지, email 인지 전혀 몰라도 됨 그냥 NotificationSender 에서 추상화된 send 만 호출
        // 전략을 추가해도 전혀 영향 없음
        sender.send(message)
    }
}