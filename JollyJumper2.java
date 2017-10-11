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
public class JollyJumper2 {
        private int currentVal;
        private int prevVal;
        private final String jolly = "Jolly";
        private final String notJolly = "Not Jolly"; 
        
    public String jollyJumper2(int[] intArray, boolean firstPass){
        for(int i=1; i < intArray.length; i++){
            this.currentVal = Math.abs(Math.abs(intArray[i-1]) - Math.abs(intArray[i]));
            if(currentVal == prevVal || currentVal == (prevVal-1) || firstPass){
                firstPass = false;
                this.prevVal = currentVal;
            }
            else{
                return notJolly;
            }           
        }
        return jolly;
    }
}
