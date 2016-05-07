package com.callback;

public abstract class Boss {
	
	public Boss(String name) {
		// TODO 自动生成的构造函数存根
		
		plan(name);
	}
	public void plan(String name) {
		
		System.out.println("老板："+"分配员工\t"+name+"\t去执行任务");
		System.out.println("\t你执行完成通知我");
		System.out.println();
		make(name);
	}
	public abstract void make(String name);
}
