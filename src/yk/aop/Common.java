package yk.aop;

public class Common {
	public void startWork(){
		System.out.println("����ִ�п�ʼ...");
	}
	public void exceptionWork(){
		System.out.println("�쳣����ִ�п�ʼ...");
		throw new RuntimeException("a new bug!");
		
	}

}
