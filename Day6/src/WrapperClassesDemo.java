
public class WrapperClassesDemo {
  public static void main(String[] args) {
	
	  int a=10;
	  System.out.println("a=>"+a);
	  Integer obj=new Integer(a); //autoboxing
	  System.out.println(obj.toString());
	  
	  int b=obj; //obj.intValue()  ->AutoUnboxing
	  
	  String val="7885.5d";
	  Double d=Double.parseDouble(val);
	  System.out.println(d);
	  Float d1=Float.parseFloat(val);
	  System.out.println(d1);
	  
}
}
