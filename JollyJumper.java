/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAlgosDSPractice;
					
public class JollyJumper {
        private int lastVal = 0;
        private int currentVal = 0;
	private boolean firstPass = false;
        private final String jolly = "Jolly";
        private final String notJolly = "Not Jolly";
	
	public String jollyJumper(int[] intArray, int index){
		
		if(index == intArray.length-1)
                    return jolly;	

                
		if(index < intArray.length-2)
                    this.currentVal = Math.abs(intArray[index]) - Math.abs(intArray[index+1]);
		
                if(firstPass == false) {
			this.lastVal = currentVal;
			firstPass = true;
                        index = index +1;
			jollyJumper(intArray, index);
		}
		else if(currentVal == lastVal || currentVal == (lastVal-1)){
                    this.lastVal = currentVal;
                    index = index + 1;
                    jollyJumper(intArray, index);
		}
                else {
                    return notJolly;
                }
                
                return jolly;
	}
}
