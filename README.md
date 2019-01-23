# java-design-patterns

## Class Diagram
- Association 관계: 지속적으로 사용  ->
- Aggregation 관계 : 다른 객체를 포함 (생명주기 다름, 재활용 가능) ◇->
- Composition 관계 : 다른 객체를 포함 (생명주기 같음) ◆->
- Dependency 관계 : 일시적으로 사용 -->
- extends 관계 -▷
- implements 관계 --▷



## 자바 디자인 패턴
**1. Iterator**  
순서를 지정해서 처리하기  
무엇인가 많이 모여있는 것들을 순서대로 지정하면서 젗체를 검색하는 처리를 실행
  
**2. ClassAdapter**  
상속을 사용한 Adapter 패턴  
'이미 제공되어 있는 것'과 필요한 것' 사이의 '차이'를 없앰  
인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있다

**3. ObjectAdapter**  
위임을 사용한 Adapter 패턴  

**4.Template Method**  
하위 클래스에서 구체적으로 처리하기

**5. Factory Method**  
하위 클래스에서 인스턴스 작성하기

**6. Singleton**  
인스턴스를 한 개만 만들기

**7. Prototype**  
복사해서 인스턴스 만들기  
인스턴스를 생성하는 것이 아니라 인스턴스로부터 별도의 인스턴스를 만드는 패턴  
이럴 때 사용!  
1) 종류가 너무 많아 클래스로 정리되자 않는 경우  
2) 클래스로부터 인스턴스 생성이 어려운 경우  
3) framework와 생성할 인스턴스를 분리하고 싶은 경우


**8. Builder**  
객체를 생성할 때 흔히 사용되는 패턴 - [[참조]](https://johngrib.github.io/wiki/builder-pattern/)  
각 인자가 어떤 의미인지 알기 쉽고 setter 메서드가 없으므로 변경 불가능한 객체를 만들 수 있다.

**9. Abstract Factory**
관련 부품을 조합해서 제품 만들기  
여러 종류의 객체를 생성할 때 객체들 사이의 관련성이 있는 경우 사용  
부품별로 Factory 클래스를 만드는 대신 제조업체별로 Factory 클래스를 만들 수 있다. - [[참조]](https://gmlwjd9405.github.io/2018/08/08/abstract-factory-pattern.html)  
사용예) SqlSessionFactory

**10. Bridge**
기능 계층과 구현 계층 분리하기  
분리하여 각각의 클래스 계층을 독립적으로 확장할 수 있다.  
상속은 견고한 연결이고 위임은 느슨한 연결이다.  


