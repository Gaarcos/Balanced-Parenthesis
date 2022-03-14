package com.cefsa.edu.br.balancedbrackets.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriateTxt {
    
    public static void writeTxt(String dataWrite) throws IOException
    {
        try(FileWriter criate = new FileWriter("validated-data.txt", true);
            BufferedWriter store = new BufferedWriter(criate);
            PrintWriter writer = new PrintWriter(store);)
            
            {
                writer.append(dataWrite);
            }
        catch(IOException e)
            {
                e.printStackTrace();
            }
            
    }
    
}
