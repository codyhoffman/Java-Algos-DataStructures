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
public class IntToBinary {
    public void IntToBinary(int num){
        String resultStr = Integer.toBinaryString(num);
        int result = Integer.parseInt(resultStr);
        System.out.println(result);
    }
}
