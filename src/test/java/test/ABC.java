package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;



class Demo1 {
	   int a;
	   int b;
	 
	   public Demo1() {
	       a = 10;
	       b = 20;
	   }
	}
	 
	class Demo2 extends Demo1 { 
	   int c = 30;
	   int d = 40;
	 
	   public Demo2(int e, int f) {
	       c = e;
	       d = f;
	   }
	 
	   public void disp() {
	       System.out.println(a); //10
	       System.out.println(b);//20
	       System.out.println(c);//30
	       System.out.println(d);//40
	       System.out.println("Nani");//40

	   }
	}
	 
	public class ABC { 
	   public static void main(String args[]) {
	       Demo2 m = new Demo2(2, 5);
	       m.disp();
	 
	 }
	}
