/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solution;

/**
 *
 * @author Abdul
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size = Integer.parseInt(in.nextLine());
        List<Integer> integerList = new ArrayList(size);
        String inputString = in.nextLine();
        String[] splitString = inputString.split(" ");
        for(int i=0; i<size; i++)
        {
              integerList.add(Integer.parseInt(splitString[i]));
        }
        int queryNumber = Integer.parseInt(in.nextLine());
        for(int j=0; j<queryNumber; j++)
        {
            String operation = in.nextLine();
            String operationValue = in.nextLine();
            if(operation.equals("Insert"))
            {
                String[] operationArray = operationValue.split(" ");
                int position = Integer.parseInt(operationArray[0]);
               int entry = Integer.parseInt(operationArray[1]);
                integerList.add(position, entry);
            }
            else if(operation.equals("Delete"))
            {
                int position = Integer.parseInt(operationValue);
                integerList.remove(position);
            }
        }
        
        for(int i=0; i<integerList.size(); i++)
        {
              System.out.print(integerList.get(i) + " ");
        }
    }
}
