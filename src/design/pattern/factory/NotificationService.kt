package design.pattern.factory

class NotificationService(
    private val factory: NotificationSenderFactory
) {
    fun notify(channel: Channel, message: NotificationMessage) {
        val sender = factory.create(channel)
        sender.send(message)
    }
}