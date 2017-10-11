/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAlgosDSPractice;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;
/**
 *
 * @author codyhoffman
 */
public class DivideStringIntoWordsAndNumbers {
    public void DivideStringIntoWordsAndNumbers(String input){
        String[] arr = input.split(",");
        System.out.println(arr);
        
        List<String> word = new ArrayList<>();
        List<String> num = new ArrayList<>();
        
        for (String arr1 : arr) {
            try {
                parseInt(arr1);
                num.add(arr1);
            } catch (Exception ex) {
                word.add(arr1);
            }
        }
        
        String numStr = String.join(",", num);
        String wordStr = String.join(",", word);
        
        System.out.println(numStr);
        
        System.out.println(wordStr);
    }
}
