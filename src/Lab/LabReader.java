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
public class LabReader {
    public static void main(String[] args) {
        File file = new File(File.separatorChar + "Users" + File.separatorChar +
                "emmakordik" + File.separatorChar + "temp" + File.separatorChar + "contacts.txt");
        
        BufferedReader input = null;
        List<String> contacts = new ArrayList<>();
        String[] lines = new String[3];
        try{
            input = new BufferedReader(new FileReader(file));
            Boolean isNull = false;
            String line = input.readLine();
            
            while(!isNull){
                for(int i =0; i<3; i++){
                    lines[i] = line;
                    line = input.readLine();
                }
              
                contacts.add("First Name " + lines[0].substring(0,lines[0].indexOf(" ")));
                contacts.add("Last Name " + lines[0].substring(lines[0].indexOf(" ")));
                contacts.add("Address: " + lines[1]);
                contacts.add("City: " + lines[2].substring(0,lines[2].indexOf(",")));
                contacts.add("State: " + lines[2].substring(lines[2].indexOf(",")+2, lines[2].indexOf(",") +4));
                contacts.add("Zip: " + lines[2].substring(lines[2].indexOf(",") + 4));
               
               if(line == null){
                   isNull = true;
               }else{
                   line = input.readLine();
               }
            }
           
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            try{
                input.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
        for(String s: contacts){
            System.out.println(s);
        }
        
    }
}
