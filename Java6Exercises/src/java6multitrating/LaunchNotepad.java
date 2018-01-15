/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6multitrating;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dragos
 */
public class LaunchNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                try {
            ProcessBuilder pb;
            // Use process builder to start 2 processes multithreading.SayHello with parameter
            pb= new ProcessBuilder("Notepad");
            Map<String, String> env = pb.environment();
  
            pb.directory(new File("C:\\Users\\Dragos\\Desktop"));
            Process p1 = pb.start();
            Process p2 = pb.start();
             Process p3 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(LaunchNotepad.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
    }
    
}
}
