package design.pattern.abstract

class NoPatternUserProfileService(private val env: String) {

    fun createUser(name: String) {
        // 인프라 선택 로직이 서비스에 박힘
        val repo = if (env == "prod") FileUserRepository("users.txt") else InMemoryUserRepository()
        val idGen = if (env == "prod") SequentialIdGenerator() else UuidLikeIdGenerator()
        val audit = if (env == "prod") FileAuditLogger("audit.txt") else ConsoleAuditLogger()

        // 예시 코드를 보면 env phase 에 따른 사용 인프라가 다를때 효율적으로 처리할 수 있음
        // 서비스가 인프라 생성/선택 책임까지 떠안음
        // 제품군 구성 요소가 늘어날수록 if (env == "prod") 같은 로직이 추가됨
        // 테스트/운영 환경 추가되면 서비스 코드를 계속 수정
        // 페이즈가 추가되면 * n 개만큼 로직 추가

        // Abstract Factory 는 서로 연관된 제품군을 통째로 생성하는데 장점
        // 일관성 보장
        // Factory Method 는 보통 제품 1개를 선택/생성하는데 장점
        // Abstract Factory 는 연관된 제품을 선택/생성하는데 장점
    }
}