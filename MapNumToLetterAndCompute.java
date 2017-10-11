/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAlgosDSPractice;

/**
 *
 * @author codyhoffman
 */
public class MapNumToLetterAndCompute {
    
    public int MapNumToLetterAndCompute(String input){
        String[] arr = input.split(" ");
        String[] nums = arr[0].split("");
        String[] letters = arr[1].split("");
        
        String leftSide = "";
        String rightSide = "";
        String opperation = "";
        
        for(String num : nums){
            for(String letter : letters){
                if(!letter.equals("+") && !letter.equals("-"))
                    leftSide = leftSide + num;
                if(letter.equals("+"))
                    opperation = "+";
                if(letter.equals("-"))
                    opperation = "-";
                else
                    rightSide = rightSide + num;
            }
        }
        int left = 0;
        if(leftSide.length() > 0)
            left = Integer.parseInt(leftSide);
        
        int right = 0;
        if(rightSide.length() > 0)
            right = Integer.parseInt(rightSide);
        
        if(opperation.equals("+"))
            return left + right;
        if(opperation.equals("-"))
            return left - right;
        return 0;
    }
}
