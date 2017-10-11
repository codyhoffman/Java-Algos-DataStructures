/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAlgosDSPractice;

import java.util.Arrays;

/**
 *
 * @author codyhoffman
 */
public class LowestUniqueInteger {
    
    public int lowestUniqueInteger(int[] myArr){
        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));
        boolean firstPass = true;
        int lowUnique = myArr[0];
        
        for(int i=1; i<myArr.length; i++){
            if(lowUnique != myArr[1] && firstPass || myArr.length == 1){
                return lowUnique;
            }
            firstPass = false;
            
            if(i == myArr.length-1 || myArr[i] < myArr[i+1]){
                if(myArr[i] > myArr[i-1]){
                    lowUnique = myArr[i];
                }
            }
        }
        
        return lowUnique;
    }
    
}
