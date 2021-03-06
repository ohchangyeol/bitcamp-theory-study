# 08_26 수업정리

## 용어 정리

	IDE - 통합 개발 환경
	프로세스
  	유니코드

# Java 

## JAVA_HOME을 왜 환경변수로 지정 해야 하는가?
이클립스는 2021년에 많은 것들이 바뀌었다. 2021년 이전에는 환경변수에 지정된 자바홈으로 이클립스가 구동이 되었다면, 현재 이클립스에서는 **플러그인으로 자바를 지원** 해주기 때문에 자바홈 환경 변수를 잡을 일이 줄어들었다.  
하지만 다른 에디터들은 자바 환경변수 지정된 것을 보고 잡는다. 그말은 즉 컴퓨터에 환경변수를 지정을 해줘야지만 더 간편하게 java_home에 접근할 수 있는것이다.

## class path
이클립스에서 **Livraries** 와 **Order and Export**로 설정할 수 있다. 

## Java Method Signature
메서드 시그너처는 웬만하면 **인터페이스**로 하는것이 좋다.

## eclipse  

이클립스의 버전마다 약간씩 다르다.
이클립스 전단계 버전이나 전전단계 버전을 선호한다.

## implements
implements를 받은 클래스는 무조건 메서드를 오버라이딩을 해야하지만 implements받은 클래스를 abstract을 주면 오버라이딩을 하지않아도 에러가 나오지않는다. 하지만 **상속부터는 오버라이딩을 무조건 해야한다**.


## API
### java.lang 
JAVA 프로그래밍에 필요한 가장 기본적인 클래스들이 묶인 패키지.

### java.util
자바를 하는데 어려가지 도구를 추상화 해서 모아둔 패키지.  
사용 안할리 없음.



### java.io
외부에서 받고 내부에서 프로세스 밖으로 내보내는 것들이 묶인 모음.
#### **특징**
- 단방향 모델링
- 큐구조 (FIFO)
- i/o 블럭
- 유연한 구조
- 4대 최상위 
  - InputStream 
  - OutputStream
  - Reader
  - Writer
	

#### InputStream
외부에서 가져오는 추상 클래스

#### outStream
밖으로 보내는 추상 클래스

#### reader
영어를 제외한 나머지 언어를 읽을 수 있게 도와주는 추상 클래스

#### writer
영어를 제외한 나머지 언어를 밖으로 보낼 수 있게 도와주는 추상 클래스

#### InputStreamReader  
InputStream을 Reader로 컨버터 해주는 역활을 하는 클래스.
- read(int i)  
읽다

#### OutputStreamWriter  
OutputStream을 Writer로 컨버터 해주는 역활을 하는 클래스.

## process  
os위에서 실행하는 어플리케이션 프로세스?

## System
컴퓨터를 추상화 한 클래스  

- in   
  키보드
- out  
  모니터
