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
public class Main {
    public static void main(String[] args)
	{
            
            MapNumToLetterAndCompute map = new MapNumToLetterAndCompute();
            String expected = "Expected: ";
            String actual = " Actual: ";
            System.out.println(expected + "579" + actual + map.MapNumToLetterAndCompute("123456 abc+def"));
            System.out.println(expected + "-111111" + actual + map.MapNumToLetterAndCompute("111111 -abcdef"));
            System.out.println(expected + "72" + actual + map.MapNumToLetterAndCompute("102030 abc-def"));
            System.out.println(expected + "1122" + actual + map.MapNumToLetterAndCompute("111111 ab+cdef"));
//            IntToBinary itb = new IntToBinary();
//            itb.IntToBinary(505);
//            ArmstrongValue arm = new ArmstrongValue();
//            arm.ArmstrongValue(123);
//            arm.ArmstrongValue(153);
//            
            
//            String str = "33,dog,cat,2,3,4,cody,hoffman,word,54,1";
//            DivideStringIntoWordsAndNumbers d = new DivideStringIntoWordsAndNumbers();
//            d.DivideStringIntoWordsAndNumbers(str);
//            
//		int[] testArray = new int[] {4,1,4,2,3};
//                int[] testArray2 = new int[] {41,1,4,2,3};
//                int[] testArray3 = new int[] {5,1,4,2,-1,6};
//                int[] testArray4 = new int[] {-4,-1,-4,-2,-3};
//                int[] ta5 = new int[] {1,4,2,-1,6};
//                int[] ta6 = new int[] {6,5,4,3,2,1};
//                
//                int startIndex = 0;
//		
//		JollyJumper jj = new JollyJumper();
//		//System.out.println("Expected: Jolly\nResult: " + jj.jollyJumper(testArray, startIndex));
//                //System.out.println("\nExpected: Not Jolly\nResult: " + jj.jollyJumper(testArray2, startIndex));
//                //System.out.println("\nExpected: Not Jolly\nResult: " + jj.jollyJumper(testArray3, startIndex));
//                //System.out.println("\nExpected: Jolly\nResult: " + jj.jollyJumper(testArray4, startIndex));
//                System.out.println("\nExpected: Not Jolly\nResult: " + jj.jollyJumper(ta5, startIndex));
//                System.out.println("\nExpected: Jolly\nResult: " + jj.jollyJumper(ta6, startIndex));
//                
//                LowestUniqueInteger lui = new LowestUniqueInteger();
//        
//                //should output: 4
//                int[] myArr = new int[] {1,2,3};
//                System.out.println(lui.lowestUniqueInteger(myArr));
//
//                int[] myArr2 = new int[] {1,4,2,3,2,1};
//                System.out.println(lui.lowestUniqueInteger(myArr2));
//                
//                JollyJumper2 jj2 = new JollyJumper2();
//                System.out.println("Expected1: Jolly\nResult: " + jj2.jollyJumper2(testArray, true));
//                System.out.println("\nExpected2: Not Jolly\nResult: " + jj2.jollyJumper2(testArray2, true));
//                System.out.println("\nExpected3: Not Jolly\nResult: " + jj2.jollyJumper2(testArray3, true));
//                System.out.println("\nExpected4: Jolly\nResult: " + jj2.jollyJumper2(testArray4, true));
//                System.out.println("\nExpected5: Not Jolly\nResult: " + jj2.jollyJumper2(ta5, true));
//                System.out.println("\nExpected6: Jolly\nResult: " + jj2.jollyJumper2(ta6, true));
	}
}
