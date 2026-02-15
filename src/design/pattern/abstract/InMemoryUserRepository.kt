package design.pattern.abstract

class InMemoryUserRepository : UserRepository {
    private val store = mutableMapOf<String, User>()

    override fun save(user: User) {
        store[user.id] = user
    }

    override fun findById(id: String): User? = store[id]
}

class UuidLikeIdGenerator : IdGenerator {
    private var counter = 0

    override fun nextId(): String {
        counter += 1
        return "dev-${System.nanoTime()}-$counter"
    }
}

class ConsoleAuditLogger: AuditLogger {
    override fun log(message: String) {
        println("[AUDIT] $message")
    }
}