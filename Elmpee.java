package com.callback;

public class Elmpee extends Boss {

	public Elmpee(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Elmpee("王自健");
	}



	@Override  //回调方法
	public void make(String name) {
		// TODO 自动生成的方法存根
		System.out.println("我是"+name+"\t老板分配我出差\n报告老板\t我执行任务完成了");
	}

}
