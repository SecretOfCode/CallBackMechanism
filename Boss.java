package com.callback;

public abstract class Boss {
	
	public Boss(String name) {
		// TODO �Զ����ɵĹ��캯�����
		
		plan(name);
	}
	public void plan(String name) {
		
		System.out.println("�ϰ壺"+"����Ա��\t"+name+"\tȥִ������");
		System.out.println("\t��ִ�����֪ͨ��");
		System.out.println();
		make(name);
	}
	public abstract void make(String name);
}
