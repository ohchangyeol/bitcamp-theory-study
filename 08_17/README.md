08_17 수업정리
===

# Java 

## 인수 
- method 의 ()안의 보내는쪽  
  호출할 때 쓰면 인수

## paramiter(매개변수) 
- method 의 ()안의 받는쪽  
  만들때 넣는것이 매개변수

## constructor ( 컨스터럭스 ) - 생성자 
- 생성하려는 class를 생성하려는 생성자 
- 객체는 서로 다른 상태를 갖는다 
- Initializr 하는 method , overloading 이랑 연관성이 높음
	
## 인스턴스 변수  
- 인스턴스한 변수. field에 있을수도 있고 뭐 다양하다. 

## extends 
- 확장( 상속 개념 )

## super , this

  - ### super() this() 
   
    `생성자와 연관 관계`  
    method의 keyword  
	아무것도 없을 때 `super()값이 default`

	- this() 
    	- 자신의 default 생성자 명시적으로 호출  
		  자기 자신을 호출할 순 없다, `constructor이 recursive` 때문에 무한으로 돌아감.

	- super() 
    	 - 상위의 default 생성자 명시적 호출   
		   아무것도 없을 때 super()값이 default / 상속이 안되있을 경우 error 

  - ### super , this 
    레퍼런스 keyword

## overloading
- class는 constructor Method로 overloading을 하여 여러 파라미터를 받아 field 의 변수들을 initialize할수 있다.
- 하나의 메서드를 다른 인자값이나 개수를 주어 다른 결과값을 출력하는 것.
## overriding
- 상속(공유)된 class는 상위의 있는 method를 하위(자신)안의 동일한 이름과 비슷한 기능을 가진 `method 를 다시 재구성`할 수 있는 것을 overriding 이라 함
- 상속된 method를 하위에서 Refectoring하는 행위.

