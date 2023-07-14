# Itda

- Instagram, Twitter와 같은 SNS 서비스 ‘Itda’를 개발하는 프로젝트
- 애플리케이션의 UI는 카카오 오븐으로 대체하여 프론트엔드 부분은 생략하고 벡엔드에 초점을 맞춰 백엔드 개발에 주력
- 단순 기능 구현 뿐 아니라 성능, 코드의 재사용성 및 유지보수성을 고려하여 구현하는 것을 목표로 개발

### ✅ 사용 기술 및 개발 환경

Java, Spring Boot, IntelliJ, Maven, MyBatis, MySQL, Redis, Jenkins, Docker


### ✅ Application UI

예시)

![Part of Application UI](https://user-images.githubusercontent.com/50859560/91076861-153e6d00-e67b-11ea-97e3-a23e9b925ab8.jpg)


### ✅ Architecture

![Architecture](https://user-images.githubusercontent.com/50859560/103137857-31791600-4710-11eb-9783-8a03dac3242c.png)


### ✅ ERD

![](https://user-images.githubusercontent.com/50859560/103099160-b69cf600-4650-11eb-8bf6-505cbff6cf9a.png)

▶ 사용자

1. 회원가입 / 탈퇴
2. 로그인 / 로그아웃
3. 회원정보 수정
4. 게시글 작성 / 수정 / 삭제 / 조회
5. 피드 조회
6. 팔로우 / 언팔로우
7. 알림 - 다른 사람이 팔로우한 경우



### ✅ 프로젝트를 진행하며 고민한 Technical Issue

* 분산 처리 환경에서 대용량 트래픽을 견디기 위한 로그인 기능 구현
* AOP를 적용하여 부가 로직 제거
* 프로퍼티 파일을 이용한 외부 설정 주입과 운영 환경에 따른 프로퍼티 파일 분리
* Spring Cache 적용으로 읽기 작업 성능 향상
* Redis LFU Eviction 정책을 적용하여 효율적인 캐시 띄우기
* Redis 성능 향상을 위한 Redis 세션 저장소와 캐시 저장소의 분리
* 부하 분산을 위한 MySQL Replication 구성 및 쿼리 요청 분기
