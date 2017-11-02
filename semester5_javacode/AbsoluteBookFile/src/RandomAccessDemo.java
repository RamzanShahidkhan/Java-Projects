import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
	public static void main(String [] arg){
		
		try {
			RandomAccessFile ioStream=new RandomAccessFile("byteData", "rw");
			System.out.println("Writing 3 files to the file byteData");
			ioStream.writeByte(1);
			ioStream.writeByte(2);
			ioStream.writeByte(3);
			System.out.println("The length of the file is now = "+ioStream.length());
			System.out.println("The file pointer location is = "+ ioStream.getFilePointer());
			System.out.println("Moving the file pointer to location 1: ");
			ioStream.seek(1);
			byte oneByte=ioStream.readByte();
			System.out.println("the value at location 1 is "+ oneByte);
			oneByte =ioStream.readByte();
			System.out.println("The value at the next location is  "+oneByte);
			
			System.out.println("Now we move the file location back  to");
			System.out.println("location 1, and change the byte. ");
			ioStream.seek(1);
			ioStream.writeByte(9);
			ioStream.seek(1);
			oneByte=ioStream.readByte();
			System.out.println("the value at location 1 is now "+ oneByte);
			
			System.out.println("Now we go to the end of the file");
			System.out.println("and write a double ");
			ioStream.seek(ioStream.length());
			ioStream.writeDouble(41.99);
			System.out.println("The length of the file is now = " +ioStream.length());
			
			System.out.println("Returnig to location 3, ");
			System.out.println("Where we wrote the double.");
			ioStream.seek(3);
			double oneDouble=ioStream.readDouble();
			System.out.println("The double value at location 3 is "+oneDouble);
			ioStream.close();
				
		} 
		catch (FileNotFoundException e) {
			System.out.println("problem opening file");
		} catch (IOException e) {
			System.out.println("problem with file I/O");
		}
		System.out.println("End of programm");
	}

}