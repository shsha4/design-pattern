package design.pattern.factory

fun main() {
    val service = NotificationService(DefaultSenderFactory())
    service.notify(
        channel = Channel.EMAIL,
        NotificationMessage("[EMAIL]", "EMAIL 알림", isAlert = true)
    )

    service.notify(
        channel = Channel.SLACK,
        NotificationMessage("[SLACK]", "SLACK 알림", isAlert = false)
    )
}