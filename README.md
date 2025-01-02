# 프로젝트 소개
- 자바 웹 앱...

1. Readme.md 파일 수정하고 commit 후, push 연습

2. 프로젝트 빌드 도구로는 다음과 같은 도구들을 활용할 수 있습니다.
 - 파일 탐색기
 - IDE
 - ant, maven, gradle
 자동화 빌드 도구인 maven을 활용했을 때, 장점은 무엇인가요? 
	> 의존성 관리, 표준화된 프로젝트 구조, 플러그인 시스템, 다양한 빌드 프로파일, 통합 및 배포, 커뮤니티와 문서화 등

3. 단위 테스트 도구인 JUnit은 각각 모듈 단위를 테스트할 때 유리합니다. 
 - 테스트 메소드 작성 방법은?
 	> 테스트 클래스 작성 → 테스트 메소드 작성(@Test 어노테이션으로 표시) → Assertions 사용
 - 테스트 메소드에서 값 일치, 참조 일치를 assertion 하는 메소드는?
	> 값 일치 : assertEquals
	> 참조 일치 : assertSame

5. VCS git을 활용하기 위해 remote repository 제공하는 대표적 서비스인 github가 있습니다.
 - 원격 저장소에 기록된 최신의 기록점을 local repository로 내려받는 동작은?
	> 프로젝트 우클릭 → Team → pull.. 
 - 원격 저장소에 기록된 프로젝트 전체 내용을 복제해서 local repository로 만드는 동작은? 
 	> Git Repositories → Clone ~~ 
