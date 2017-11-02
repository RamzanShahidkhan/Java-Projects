import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Addressbook {
	public Addressbook() {
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<PersonInfo> arrayList = new ArrayList<PersonInfo>();
	
	void addPerson()
	{
		String name=JOptionPane.showInputDialog("enter name");
		String address=JOptionPane.showInputDialog("enter address");
		String number=JOptionPane.showInputDialog("enter phone_number");
		
		PersonInfo personInfo=new PersonInfo(name, address, number);
		arrayList.add(personInfo);
		System.out.println(name+" ,"+address+" ," +number);
		try {
		    FileOutputStream fos = new FileOutputStream("output.txt");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);   
		    oos.writeObject(arrayList); // write MenuArray to ObjectOutputStream
		    oos.close(); 
		} catch(Exception ex) {
		    ex.printStackTrace();
		}
		
		/*
		 * try {
			FileWriter fileWriter = new FileWriter("mhk.txt");
			Writer output = new BufferedWriter(fileWriter);
			for(int i=0;i<1;i++){
				output.write(arrayList.toString());
			}
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	    
		
	}
	
	void deletePerson()
	{
		
	}
	void searchPerson()
	{
		
	}
	
	
}
