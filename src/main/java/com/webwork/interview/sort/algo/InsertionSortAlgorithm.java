package com.webwork.interview.sort.algo;

import java.util.Arrays;

public class InsertionSortAlgorithm {

  public static void main(String args[]){
    Integer[] numberArray = new Integer[]{4,5,3,7,2,3,3,5,6,3,5};
    Arrays.asList(numberArray).stream().forEach(System.out::print);
    System.out.println();
    Integer[] sortedArray = insertionSortAlgorithm(numberArray);
    Arrays.asList(sortedArray).stream().forEach(System.out::print);
  }

  private static Integer[] insertionSortAlgorithm(Integer[] numberArray) {
    for( int i = 1; i < numberArray.length; ++i){
      int temp = numberArray[i];
      int j = i-1;
      while(j>=0 && temp < numberArray[j]){
        numberArray[j+1] = numberArray[j];
        j = j-1;
      }
      numberArray[j+1] = temp;
    }
    return numberArray;
  }

}
