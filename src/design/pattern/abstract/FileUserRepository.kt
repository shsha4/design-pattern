package design.pattern.abstract

import java.io.File

class FileUserRepository(private val path: String) : UserRepository {
    private val file = File(path).apply { if (!exists()) createNewFile() }

    override fun save(user: User) {
        file.appendText("${user.id},${user.name}\n")
    }

    override fun findById(id: String): User? {
        val line = file.readLines().firstOrNull { it.startsWith("$id,") } ?: return null
        val parts = line.split(",", limit = 2)
        return User(parts[0], parts[1])
    }
}

class SequentialIdGenerator : IdGenerator {
    private var seq = 0

    override fun nextId(): String {
        seq += 1
        return "prod-$seq"
    }
}

class FileAuditLogger(private val path: String) : AuditLogger {
    private val file = File(path).apply { if (!exists()) createNewFile() }

    override fun log(message: String) {
        file.appendText("[AUDIT] $message\n")
    }
}