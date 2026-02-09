package design.pattern.factory

// 일반 도메인 객체
// Sender 구현을 전혀 몰라도 된다
data class NotificationMessage(
    val title: String,
    val body: String,
    val isAlert: Boolean
)
