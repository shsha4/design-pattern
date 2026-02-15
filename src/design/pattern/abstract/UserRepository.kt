package design.pattern.abstract

// env == prod example service set
interface UserRepository {
    fun save(user: User)
    fun findById(id: String): User?
}

interface IdGenerator {
    fun nextId(): String
}

interface AuditLogger {
    fun log(message: String)
}