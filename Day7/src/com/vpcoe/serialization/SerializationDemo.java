package com.vpcoe.serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	void serializeEmp() throws IOException {
    	Employee e=new Employee(1001,"Chetna",50000,11445);	
    
    	FileOutputStream fout=new FileOutputStream("D://source//Emp.ser");
    	ObjectOutputStream obj=new ObjectOutputStream(fout);
    	obj.writeObject(e);
    	obj.close();
    	fout.close();
    	System.out.println("Emp object serialized");
	}
	
    void DeserializeEmp() throws IOException, ClassNotFoundException {
    	FileInputStream fout=new FileInputStream("D://source//Emp.ser");
    	ObjectInputStream obj=new ObjectInputStream(fout);
    	Employee e=(Employee)obj.readObject();
    	obj.close();
    	fout.close();
    	System.out.println("Emp object Deserialized");
    	System.out.println(e);
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializationDemo sd=new SerializationDemo();
		sd.serializeEmp();
		sd.DeserializeEmp();
	}
}
