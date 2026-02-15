package design.pattern.abstract

interface InfraFactory {
    fun userRepo(): UserRepository
    fun idGenerator(): IdGenerator
    fun auditLogger(): AuditLogger
}