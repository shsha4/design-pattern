package design.pattern.factory
/*
* 예제 알림 발송 시스템 가정
* 패턴 없이 짠 케이스
* */
class NoPatternNotification {
    fun sendNotification(type: String,
                         channel: String,
                         message: String) {
        when (channel) {
            "SLACK" -> {
                if (type == "ALERT") {
                    println("슬랙 장애 알림 전송 : $message")
                } else {
                    println("슬랙 일반 알림 전송 : $message")
                }
            }
            "EMAIL" -> {
                if (type == "ALERT") {
                    println("이메일 장애 알림 전송 : $message")
                } else {
                    println("이메일 일반 알림 전송 : $message")
                }
            }

            // SMS, PUSH 추가되면 계속 case when 추가?
            // 타입 하나 늘어나면 전부 다 추가?
        }
    }
}