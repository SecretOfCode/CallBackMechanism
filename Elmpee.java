package com.callback;

public class Elmpee extends Boss {

	public Elmpee(String name) {
		super(name);
		// TODO �Զ����ɵĹ��캯�����
	}

	

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Elmpee("���Խ�");
	}



	@Override  //�ص�����
	public void make(String name) {
		// TODO �Զ����ɵķ������
		System.out.println("����"+name+"\t�ϰ�����ҳ���\n�����ϰ�\t��ִ�����������");
	}

}
