import java.io.FileOutputStream;
import java.io.*;
import java.util.*;
import java.sql.*; 
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
public class jdbc_pdf_report {
	
      	 String  connectionString="jdbc:mysql://localhost/segp";
      	 Connection conn =null;
      	 Statement stmt =null;
	public void printPdf() throws Exception
	{
		
       	 
               System.out.println("program cahlllda pia ha");
               /* Create Connection objects */
               //Class.forName ("oracle.jdbc.OracleDriver"); 
               //Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "hr", "hr");
       	    conn = DriverManager.getConnection(connectionString, "root", null);
               stmt = conn.createStatement();
               /* Define the SQL query */
               ResultSet query_set = stmt.executeQuery("SELECT * FROM teacher");
               /* Step-2: Initialize PDF documents - logical objects */
               Document my_pdf_report = new Document();
               PdfWriter.getInstance(my_pdf_report, new FileOutputStream("pdf_report.pdf"));
               my_pdf_report.open();            
               //we have four columns in our table
               PdfPTable my_report_table = new PdfPTable(4);
               //create a cell object
               PdfPCell table_cell;
            
               table_cell =new PdfPCell(new Phrase("userName"));
               my_report_table.addCell(table_cell);
           
               table_cell=new PdfPCell(new Phrase("Depart_name"));
               my_report_table.addCell(table_cell);
               
               table_cell=new PdfPCell(new Phrase("email"));
               my_report_table.addCell(table_cell);
             
               table_cell=new PdfPCell(new Phrase("Position"));
               my_report_table.addCell(table_cell);
              
               while (query_set.next()) {                
                               String dept_id = query_set.getString("userName");
                               table_cell =new PdfPCell(new Phrase(dept_id));
                               my_report_table.addCell(table_cell);
                               String dept_name=query_set.getString("department");
                               table_cell=new PdfPCell(new Phrase(dept_name));
                               my_report_table.addCell(table_cell);
                               String manager_id=query_set.getString("email");
                               table_cell=new PdfPCell(new Phrase(manager_id));
                               my_report_table.addCell(table_cell);
                               String location_id=query_set.getString("postion");
                               table_cell=new PdfPCell(new Phrase(location_id));
                               my_report_table.addCell(table_cell);
                               }
               /* Attach report table to PDF */
               my_pdf_report.add(my_report_table);                       
               my_pdf_report.close();
               
               /* Close all DB related objects */
               query_set.close();
               stmt.close(); 
               conn.close();               
               
       }
	
      public static void main(String[] args) throws Exception{
    	  jdbc_pdf_report pdf =new jdbc_pdf_report();
    	  pdf.printPdf();
      }
	    
}