
public class ThisDemo {
 int val;
 
 ThisDemo(ThisDemo td){
	   System.out.println("td accessed");	 
	 }
	 
 ThisDemo(int val){
	 //this(20,25);
	 this.val=val;	
   
 }
 
 void dispVal() {
	 System.out.println("Val:"+val);
	 this.printHello();
	 this.sample(this);
 }
 
 void printHello() {
	 System.out.println("Hello Friends!!");
 }
 
 void sample(ThisDemo td) {
	 System.out.println("TD:"+td);
 }
 
 ThisDemo getThisDemo() {
	 return this;
 }
}
