package chapter06;

// 자바의 정석 234p, 53

// 하나의 소스파일에는 하나의 클래스만 작성하는 것이 바람직하다.
public class Hello2 {} // public은 소스파일 이름과 일치해야함. 
//public class Hello3 {} ----> 하나의 소스파일에 public이 2개면 안됨. 

class Hello4 {}

// public class가 하나도 없을 경우 클래스 이름 아무거나와 소스파일 이름 일치하면 됨.
// 위의 내용은 오류는 나지 않지만 main 메서드를 추가해주었을때 다른 파일이 실행될 수도 있다.
