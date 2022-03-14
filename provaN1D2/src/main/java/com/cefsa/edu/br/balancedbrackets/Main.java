package com.cefsa.edu.br.balancedbrackets;

import static com.cefsa.edu.br.balancedbrackets.model.DataCheck.checkArchive;
import com.cefsa.edu.br.balancedbrackets.model.CriateTxt;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        
            Scanner entry = new Scanner(new FileReader("input.txt"));
            
            while (entry.hasNextLine()) 
            {
                String line = entry.nextLine();
            
            if (checkArchive(line))
            {
            CriateTxt.writeTxt(line + "- Dado Valido\n");
            }
            else
            CriateTxt.writeTxt(line + "- Dado Invalido\n");
            }
    }
}
