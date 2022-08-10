## dongblog

### 07-13
 - MockMvc를 이용해 controller 테스트 코드 작성
 - HTTP content-type : application/x-www-form-urlencoded, json 학습
 
### 07-14
 - @Valid를 이용한 검증
 - jsonPath로 Test 코드 작성 시 json 값 테스트
 - @ControllerAdvice로 Controller 예외처리를 한 곳에서 처리할 수 있도록 만듦
 
### 07-17
 - ObjectMapper를 이용해 Object -> json으로 만들어 테스트 코드 작성
 - Builder 패턴으로 객체생성 코드 변경, 장점 학습
   - 가독성이 좋다
   - 값 생성에 유연하다
   - 객체가 불변성을 가진다
 - 글 등록(Post) 후 클라이언트에게 응답 방법 학습
   - Case1. 저장한 데이터 Entity -> reponse로 응답
   - Case2. 저장한 데이터 Primary_id -> reponse로 응답
   - Case3. 응답 필요 없음 -> 클라이언트가 데이터(context)를 잘 관리하는 경우
   
### 07-19
 - 게시글 단건, 목록 조회 기능 / 테스트 코드 개발
   - 엔티티 안에 서비스 정책을 넣는 것 금지
   - 응답 클래스를 따로 만들어서 사용

### 07-22
 - 게시글 페이징처리
   - Pageable 인터페이스 학습
   - Sort로 페이지 정렬 순서 변경 학습
   - application 파일 페이징 설정
   - @PageableDefault
   
### 07-23
 - 게시글 페이징(QueryDSL)
   - QueryDSL 환경설정
   - 페이징 처리 변경
 - 게시글 수정
   - PostEditor를 만들어 수정이 가능한 부분만 수정할 수 있도록 만듦
   - 수정 테스트 코드 작성
   
### 07-26
 - 게시글 삭제
   - 삭제에 대한 테스트 코드 작성
 - 예외처리
   - controller, service 예외처리에 대한 테스트 코드 작성
   - 커스텀 예외(PostNotFound, InvalidRequest)를 만들어 예외처리
   - 상위 커스텀 예외(DongBlogException)를 만들어서 예외 공통처리
   
### 07-27
 - Spring REST Docs를 이용해 문서화 학습
   - Gradle 설정, Test 코드를 작성해 요청, 응답 필드 문서화
 
### 07-29
 - Vue.js 설치 및 환경설정

### 08-01
 - 글 작성화면 만들기
 - CORS 문제 해결

### 08-02
 - 글 리스트 화면 만들기
 - 글 내용 화면 만들기
 - 글 수정 화면 만들기
 
### 08-03
 - 화면 이쁘게 만들기
