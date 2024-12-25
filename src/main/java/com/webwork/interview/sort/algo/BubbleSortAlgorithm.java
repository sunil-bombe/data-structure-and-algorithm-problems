package com.webwork.interview.sort.algo;

import java.util.Arrays;

public class BubbleSortAlgorithm {

  public static void main(String args[]){
    Integer[] numberArray = new Integer[]{4,5,3,7,2,3,3,5,6,3,5};
    Arrays.asList(numberArray).stream().forEach(System.out::print);
    System.out.println();
    Integer[] sortedArray = bubbleSortAlgorithm(numberArray);
    Arrays.asList(sortedArray).stream().forEach(System.out::print);
  }

  private static Integer[] bubbleSortAlgorithm(Integer[] numberArray) {
    for(int i = 0; i< numberArray.length; i++){
      for(int j = 0; j<numberArray.length-1-i; j++){
        if(numberArray[j] > numberArray[j+1]){
          Integer temp = numberArray[j];
          numberArray[j] = numberArray[j+1];
          numberArray[j+1] = temp;
        }
      }
    }
    return numberArray;
  }

}
