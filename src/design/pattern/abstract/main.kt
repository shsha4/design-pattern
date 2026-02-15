package design.pattern.abstract

fun main() {
    val devService = UserProfileService(InMemoryInfraFactory())
    val devId = devService.createUser("minjun")
    println("DEV find : ${devService.getUser(devId)}")

    val prodService = UserProfileService(FileInfraFactory("users.txt", "audit.txt"))
    val prodId = prodService.createUser("minjun")
    println("PROD find : ${prodService.getUser((prodId))}")
}