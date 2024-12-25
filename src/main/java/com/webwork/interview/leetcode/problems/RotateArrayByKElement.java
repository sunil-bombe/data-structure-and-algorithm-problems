package com.webwork.interview.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RotateArrayByKElement {

  public static void main(String args[]) {

    int size = 0;
    Integer rotate = 0;
    System.out.println("Enter the Size of an Array");
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] elementArray = new int[size];
    int[] resultArray = new int[size];

    for (int i = 0; i < elementArray.length; i++) {
      elementArray[i] = sc.nextInt();
    }
    System.out.println("Filled all the element in array");
    for (int i = 0; i < elementArray.length; i++) {
      System.out.print(elementArray[i] + " ");
    }
    System.out.println();

    System.out.println("Enter the rotate number");
    rotate = sc.nextInt();

//    for (int i = 0; i < elementArray.length; i++){
//      int tempIndex = i + rotate;
//      if(tempIndex < elementArray.length){
//        resultArray[tempIndex] = elementArray[i];
//      }else{
//        resultArray[tempIndex-elementArray.length] = elementArray[i];
//      }
//    }

//    int[] kArray = new int[rotate];
//
//    for(int i =0; i < elementArray.length; i++){
//      if(i < kArray.length){
//        kArray[i] = elementArray[i];
//      }
//      int tempIndex = i + rotate;
//      if(tempIndex < elementArray.length) {
//        elementArray[i] = elementArray[tempIndex];
//      }else{
//        elementArray[i] = kArray[tempIndex - elementArray.length];
//      }
//    }

    int[] kArray = new int[rotate];

    for(int i = elementArray.length-1; i >= 0; i--){
      if(i < kArray.length){
        kArray[i] = elementArray[i];
      }
      int tempIndex = i - rotate;
      if(tempIndex > 0) {
        elementArray[i] = elementArray[tempIndex];
      }else{
        elementArray[i] = kArray[tempIndex+rotate];
      }
    }



//    Map<Integer, Integer> map = new HashMap<>();
//    for (Integer i = 0; i < elementArray.length; i++) {
//      Integer tempIndex = i + rotate;
//      if (tempIndex < elementArray.length) {
//        if (!map.containsKey(i)) {
//          map.put(tempIndex, elementArray[tempIndex]);
//          elementArray[tempIndex] = elementArray[i];
//        } else {
//          map.put(tempIndex, elementArray[tempIndex]);
//          elementArray[tempIndex] = map.get(i);
//        }
//      } else {
//        if (map.containsKey(i)) {
//          elementArray[tempIndex - elementArray.length] = map.get(i);
//        }
//      }
//    }

    System.out.println("Printing the rotated element");
    for (int i = 0; i < elementArray.length; i++) {
      System.out.print(elementArray[i] + " ");
    }
  }

    int[] rotate(int[] nums){
    int temp;
    for(int i = 0; i < nums.length; i++){
      temp = nums[i];
      nums[i] = nums[nums.length-1];
    }
    return  null;
    }

}
