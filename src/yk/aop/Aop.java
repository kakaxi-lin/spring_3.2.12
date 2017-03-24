package yk.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aop {
	public void before(){
		System.out.println("开始前。。。");
	}
	//正常结束后
	public void after_returning(){
		System.out.println("正常结束后。。。");
	}
	//环绕通知
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around 开始....");
		//执行目标程序
		pjp.proceed();
		System.out.println("around 结束....");
	}
	//异常通知
	public void throwing(){
		System.out.println("抛出异常。。。");
	}
	//最终执行
	public void after(){
		System.out.println("最终执行。。。");
	}

}
