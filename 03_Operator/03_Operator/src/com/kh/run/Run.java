package com.kh.run;
import com.kh.operator.A_Arithmetic;
import com.kh.operator.B_InDecrease;
import com.kh.operator.C_Compound;
import com.kh.operator.D_LogicalN;
import com.kh.operator.E_Comp;
import com.kh.operator.F_Logical;
import com.kh.operator.G_Triple;



public class Run {
	public static void main(String[] args) {
		
		A_Arithmetic a = new A_Arithmetic();
		
//		a.method01();
//		a.candy();
		
		B_InDecrease b = new B_InDecrease();
//		b.method1();
//		b.method2();
//		b.method3();
//		b.method4();
		
		C_Compound c = new C_Compound();
//		c.method1();
		
		D_LogicalN d = new D_LogicalN();
//		d.method1();
		
		E_Comp e = new E_Comp();
//		e.method1();
		
		F_Logical f = new F_Logical();
//		f.method1();
//		f.method2();
//		f.method3();
//		f.method4();
		
		G_Triple g = new G_Triple();
//		g.method1();
//		g.method2();
		g.method3();
		
		
		
	}

}
