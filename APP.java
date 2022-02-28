/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;
import com.itextpdf.text.DocListener;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**

 */
public class APP {

    /**
     application main frame
     */
    public static void main(String[] args) throws DocumentException, FileNotFoundException, IOException {//throws DocumentException, FileNotFoundException {
       marketing frame= new marketing();
       frame.setSize(1000,1000);
       frame.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {

           @Override
           public void run() {
              // new marketing(); //To change body of generated methods, choose Tools | Templates.
           }
       });
       frame.setDefaultCloseOperation(marketing.EXIT_ON_CLOSE);



       
   


 

   
   }
    
}
