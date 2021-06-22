package com.calculator;

import java.awt.*;
class Q 
{
		
		
		Scrollbar s1; 
		Label l1;
		Q()
		{
			Frame f=new Frame("example label");
			MenuBar mb=new MenuBar();
			Menu menu=new Menu("menu");
			Menu submenu=new Menu("sub menu");
			MenuItem i1=new MenuItem("1");
			MenuItem i2=new MenuItem("2");
			MenuItem i3=new MenuItem("2");
			menu.add(i1);
			submenu.add(i2);
			submenu.add(i3);
			menu.add(submenu);
			mb.add(menu);
			f.setMenuBar(mb);
			f.setSize(200,200);
			f.setVisible(true);
		}		
}
class Adv_java
{
	public static void main(String args[])
	{
		new Q();
	}
 }
