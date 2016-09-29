package java_session1Assingment3;

public class swaptwovalue {
	int a,b;
	public swaptwovalue(int x,int y){
		a=x;
		b=y;
	}
	public void swap(){		
		System.out.println("initial value of a is:\t"+a+"  and b is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped no. is:\ta:"+a+"  and  b:"+b);
		
	}
  
	public static void main(String[] args) {
		swaptwovalue obj1 = new swaptwovalue(10,20);
		obj1.swap();
		// TODO Auto-generated method stub

	}

}
