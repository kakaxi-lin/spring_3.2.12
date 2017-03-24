package yk.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aop {
	public void before(){
		System.out.println("��ʼǰ������");
	}
	//����������
	public void after_returning(){
		System.out.println("���������󡣡���");
	}
	//����֪ͨ
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around ��ʼ....");
		//ִ��Ŀ�����
		pjp.proceed();
		System.out.println("around ����....");
	}
	//�쳣֪ͨ
	public void throwing(){
		System.out.println("�׳��쳣������");
	}
	//����ִ��
	public void after(){
		System.out.println("����ִ�С�����");
	}

}
