/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAlgosDSPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

/**
 *
 * @author codyhoffman
 */
public class ArmstrongValue {
    public void ArmstrongValue(int val){
        String strVal = Integer.toString(val);
        String[] arr = strVal.split("");
        int result = 0;
        for(String s : arr){
            int x = Integer.parseInt(s);
            result = result + (x * x * x);
        }
        
        if(result == val)
            System.out.println(strVal + " is Armstrong Value");
        else
            System.out.println(strVal + " is not Armstrong Value");
    }
}
