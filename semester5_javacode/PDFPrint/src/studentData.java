import java.io.FileOutputStream;
import java.io.*;
import java.util.*;

import javax.swing.text.Document;

import java.sql.*; 
import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.*;
public class studentData {
	
      	 String  connectionString="jdbc:mysql://localhost/segp2";
      	 Connection conn =null;
      	 Statement stmt =null;
      	 
	public void printPdf() throws Exception
	{
		
       	 
          
               /* Create Connection objects */
               //Class.forName ("oracle.jdbc.OracleDriver"); 
               //Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "hr", "hr");
       	    conn = DriverManager.getConnection(connectionString, "root", null);
               stmt = conn.createStatement();
               /* Define the SQL query */
               ResultSet query_set = stmt.executeQuery("SELECT * FROM students");
               /* Step-2: Initialize PDF documents - logical objects */
               Document my_pdf_report = new Document();
               PdfWriter.getInstance(my_pdf_report, new FileOutputStream("studentdatFile.pdf"));
               my_pdf_report.open();  
               Font pdfFont=new Font(FontFamily.TIMES_ROMAN,12);
               // to set the number of columns in table and count the columns 
               ResultSetMetaData rsmd =query_set.getMetaData();
               int colsNum =rsmd.getColumnCount();
               //we have four columns in our table
               PdfPTable my_report_table = new PdfPTable(colsNum);
               //create a cell object
               PdfPCell table_cell;
            
               table_cell =new PdfPCell(new Phrase("Name"));
               my_report_table.addCell(table_cell);
           
               table_cell=new PdfPCell(new Phrase("name"));
              // table_cell.addElement((Element) pdfFont);
               my_report_table.addCell(table_cell);
               
               table_cell=new PdfPCell(new Phrase("id"));
               my_report_table.addCell(table_cell);
             
               table_cell=new PdfPCell(new Phrase("dept"));
               my_report_table.addCell(table_cell);
               
               table_cell=new PdfPCell(new Phrase("year"));
               my_report_table.addCell(table_cell);
               
               table_cell=new PdfPCell(new Phrase("email"));
               my_report_table.addCell(table_cell);
               
               table_cell=new PdfPCell(new Phrase("pat"));
               my_report_table.addCell(table_cell);
               
               while (query_set.next()) {                
                               String dept_id = query_set.getString("name");
                               table_cell =new PdfPCell(new Phrase(dept_id));
                               my_report_table.addCell(table_cell);
                               String dept_name=query_set.getString("id");
                               table_cell=new PdfPCell(new Phrase(dept_name));
                               my_report_table.addCell(table_cell);
                               String father_name=query_set.getString("dep");
                               table_cell=new PdfPCell(new Phrase(father_name));
                               my_report_table.addCell(table_cell);
                               String program_id=query_set.getString("year");
                               table_cell=new PdfPCell(new Phrase(program_id));
                               my_report_table.addCell(table_cell);
                               String email_id=query_set.getString("email");
                               table_cell=new PdfPCell(new Phrase(email_id));
                               my_report_table.addCell(table_cell);
                               String contact_id=query_set.getString("pat");
                               table_cell=new PdfPCell(new Phrase(contact_id));
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
    	  studentData pdf =new studentData();
    	  pdf.printPdf();
      }
	    
}