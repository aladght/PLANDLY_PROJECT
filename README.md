## PLANDLY(프랜들리)
일정관리 및 동기부여를 할 수 있는 웹사이트

### 1. 프로젝트 정보
JSP 서블릿과 톰캣서버, 마이바티스를 활용하여 만든 일정관리 웹사이트입니다.

개발기간 : 2023.09.04 ~ 2023.09.19

### 2. 개발환경
IDE : Eclipse

Database : Oracle DB

Framework : Apache Maven

ORM : MyBatis

## 주요기능
#### 1. 로그인 및 회원가입

- 카카오 로그인 API를 활용한 간편로그인 가능, 회원가입 시 아이디 중복체크 확인 및 DB값에 정보 저장.

#### 2. 인생카운트 시계

- 생년월일 값을 입력받아 일반 자바 객체에서 일, 시, 분, 초로 값을 변환 후 자바스크립트를 통해 카운팅을 진행함.

#### 3. 명언 기능

- 명언을 크롤링하여 DB에 값을 저장 후 웹사이트 상단 NAV 밑에 인생카운트 시계와 함께 배치함.

#### 4. 오픈 게시판 기능

- DB에 저장되어 있는 값을 join후 반복문을 통한 오픈 게시물 로직 완성.

#### 5. 카테고리 기능

- 카테고리 클릭 시 DB의 where절에 해당 카테고리명이 입력되어 각 사용자별 선호하는 카테고리에 맞게 게시물을 필터링해서 볼 수 있는 기능. 

#### 6. 일정관리 기능

- 풀캘린더 API를 활용한 캘린더 기능, alert창으로 일정추가가 가능함.
  
- CRUD가 모두 가능한 로직 완성


#### 7. TODO리스트 기능

- 캘린더의 일정 클릭 시 TODO리스트를 작성할 수 있음. 
    
- 각 TODO리스트는 카테고리 설정 및 공개/비공개가 가능하다.

- 모든 값은 DB에 저장되며 CRUD가 가능하도록 설계함.


## 팀원 소개 및 역할분담
#### 팀장 : 진영준 (Main : Back-End, Sub : Front-End)
- 프로젝트 총괄 및 일정관리
- 로그인 및 회원가입 로직 구현(카카오 로그인 API사용)
- 오픈 게시판 게시물 로직 구현
- 인생카운트 시계 로직 구현 및 CSS 디자인
- 크롤링된 명언 웹페이지 출력 로직 구현
- 로그인 화면 및 오픈 게시판 CSS 서포트 및 디자인

#### 팀원 : 이중호 (Main : Crawling & DB, Sub : Front-End)
- 웹사이트 크롤링을 통한 명언 크롤링 및 수집자료 DB저장
- DB설계 및 ER다이어그램 설계
- 자바스크립트를 통한 좋아요 기능, 찜하기 기능 제작
- 오픈 게시판, 게시물 카드 디자인 구상 및 구현

#### 팀원 : 임유민 (Main : Front-End)
- UI/UX 설계
- 웹사이트 상단 NAV 구현
- 동기방식의 내정보 탭 페이지 구현
- 투두리스트 작성칸 CSS 디자인

#### 팀원 : 한창헌 (Main : Back-End)
- 풀 캘린더 API 연동을 통한 캘린더 일정 및 TODO리스트의 비동기 CRUD 기능 구현
- 캘린더 TODO리스트 게시물의 공개/비공개 로직 구현
- 오픈 게시판 카테고리 별 필터링 로직 구현
- 웹사이트 전반적 디버깅 수정
