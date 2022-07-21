# Spring Study or Toy Project
## MASTERING SPRING 5

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
