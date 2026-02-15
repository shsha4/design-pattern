package design.pattern.abstract

class InMemoryInfraFactory: InfraFactory {
    override fun userRepo(): UserRepository = InMemoryUserRepository()
    override fun idGenerator(): IdGenerator = UuidLikeIdGenerator()
    override fun auditLogger(): AuditLogger = ConsoleAuditLogger()
}

class FileInfraFactory(
    private val userPath: String,
    private val auditPath: String
): InfraFactory {
    override fun userRepo(): UserRepository = FileUserRepository(userPath)
    override fun idGenerator(): IdGenerator = SequentialIdGenerator()
    override fun auditLogger(): AuditLogger = FileAuditLogger(auditPath)
}