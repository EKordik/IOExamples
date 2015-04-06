/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.io.*;

/**
 *
 * @author emmakordik
 */
public class LabWriter {
    public static void main(String[] args) throws Exception {
        File file = new File(File.separatorChar + "Users" + File.separatorChar +
                "emmakordik" + File.separatorChar + "temp" + File.separatorChar + "contacts.txt");
        boolean append = false;
        
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(file, append)));
        
        output.println("Samuel Clements");
        output.println("334 River Rd");
        output.println("Somewhere, MO 45555");
        output.println("|");
        output.println("Willaim Shakespear");
        output.println("555 Player Rd");
        output.println("England, NY 45555");
        output.println("|");
        output.println("Private So-SO");
        output.println("One Academy Blvd");
        output.println("Big Sandy, TX 75755");
        output.println("|");
        
        output.close();
      
    }
}
