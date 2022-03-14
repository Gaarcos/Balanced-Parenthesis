package com.cefsa.edu.br.balancedbrackets.model;

import java.util.ArrayDeque;
import java.util.Deque;

public class DataCheck {
    public static boolean checkArchive(String data)
    {
        Deque<Character> queue
            = new ArrayDeque<Character>();
 
        for (int i = 0; i < data.length(); i++)
        {
            char x = data.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                queue.push(x);
                continue;
            }
            if (queue.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = queue.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = queue.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = queue.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        return (queue.isEmpty());
    }
}
