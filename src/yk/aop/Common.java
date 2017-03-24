package yk.aop;

public class Common {
	public void startWork(){
		System.out.println("程序执行开始...");
	}
	public void exceptionWork(){
		System.out.println("异常程序执行开始...");
		throw new RuntimeException("a new bug!");
		
	}

}
