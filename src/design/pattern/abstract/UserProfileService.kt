package design.pattern.abstract

class UserProfileService(private val factory: InfraFactory) {
    // 서비스는 기능에만 집중
    // 인프라 조합은 factory 가 책임
    private val repo = factory.userRepo()
    private val idGen = factory.idGenerator()
    private val audit = factory.auditLogger()

    fun createUser(name: String): String {
        val id = idGen.nextId()
        repo.save(User(id, name))
        audit.log("created user: $id name=$name")
        return id
    }

    fun getUser(id: String): User? = repo.findById(id)
}