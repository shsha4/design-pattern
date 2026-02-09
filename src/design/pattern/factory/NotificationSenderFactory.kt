package design.pattern.factory

// factory create 추상화
interface NotificationSenderFactory {
    fun create(channel: Channel): NotificationSender
}

// 기본 팩토리 패턴 (전략 선택 로직을 한 곳에서 관리)
class DefaultSenderFactory : NotificationSenderFactory {
    override fun create(
        channel: Channel
    ): NotificationSender {
        return when (channel) {
            Channel.EMAIL -> EmailSender()
            Channel.SLACK -> SlackSender()
        }
    }
}

// 전략 구분자 enum
enum class Channel {
    SLACK,
    EMAIL
}