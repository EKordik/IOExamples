/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emmakordik
 */
public class LabReader2 {
    public static void main(String[] args){
        File file = new File(File.separatorChar + "Users" + File.separatorChar +
                "emmakordik" + File.separatorChar + "temp" + File.separatorChar + "contacts.txt");
        
        BufferedReader input = null;
        List<List> contacts = new ArrayList<>();
        List<String>lines = new ArrayList<>();
//        String[] lines = new String[3];
        try{
            input = new BufferedReader(new FileReader(file));
            String line = input.readLine();
            
            while(line != null){
                while(!(line.equals("|")) && line != null){
                    lines.add(line);
                    line = input.readLine();
                }

              line = input.readLine();
            }
            contacts.add(lines);
           
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            try{
                input.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
       
        for(int i=0; i<contacts.size(); i++){
            System.out.println(contacts.get(i));
        }
        
    }
}
