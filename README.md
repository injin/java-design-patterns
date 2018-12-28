# java-design-patterns

## Class Diagram
- Association 관계: 지속적으로 사용  ->
- Aggregation 관계 : 다른 객체를 포함 (생명주기 다름, 재활용 가능) ◇->
- Composition 관계 : 다른 객체를 포함 (생명주기 같음) ◆->
- Dependency 관계 : 일시적으로 사용 -->
- extends 관계 -▷
- implements 관계 --▷



## 자바 디자인 패턴
**1. iterator**  
순서를 지정해서 처리하기  
무엇인가 많이 모여있는 것들을 순서대로 지정하면서 젗체를 검색하는 처리를 실행
  
**2. classAdapter**  
상속을 사용한 Adapter 패턴  
'이미 제공되어 있는 것'과 필요한 것' 사이의 '차이'를 없앰  
인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있다

**3. objectAdapter**  
위임을 사용한 Adapter 패턴  

**4. template method**  
하위 클래스에서 구체적으로 처리하기

**5. factory method**  
하위 클래스에서 인스턴스 작성하기

