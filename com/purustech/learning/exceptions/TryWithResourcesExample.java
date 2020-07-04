package com.purustech.learning.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args)
    {
        String filePath = "D:\\MyWork\\IntelliJProjects\\SampleProject\\src\\com\\purustech\\learning\\exceptions\\DataToRead.txt";
        System.out.println( readFileContent(filePath));
    }

    // read file using buffered reader
    private static String readFileContent(String filePath)
    {
         StringBuilder contentBuilder = new StringBuilder();
         try(FileReader fileReader = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fileReader))
        // try
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
}
