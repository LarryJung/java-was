# 웹 애플리케이션 서버
Reflection API와 어노테이션에 기반한 프레임워크 구현  
---  

**Project duration** : 1개월 (2018.07)   
**Language** : Java 1.8   
**Skill specification** : JUnit, Gradle
**개발 인원** : 1명  

**주요 기능**
- @Controller, @RequestParams 기반으로 controller 작성 가능 
- ModelAndView as a Controller return type 
- exception 발생 시 핸들러 구현

**구현 단계 및 성과**   
- 직접 HTTP 파싱을 통해 요청을 수행하는 전과정 경험  
- spring mvc 의 컨셉을 따라가보며 구조에 대한 이해
- 어노테이션, reflection을 사용하며 이전에 경험하지 못한 자바 언어 학습   
- 순수 자바 프로그래밍으로 프레임워크의 도움 없이 구현했다는 성취감

**아쉬운 점, 보완할 점**
- 소켓 프로그래밍의 미흡으로 인해 통신상의 버그 존재
- 제약 조건 하에서 동작하는 템플릿 엔진 기능
- 실제 스프링과 같이 Bean context와 DI기능 추가 예정