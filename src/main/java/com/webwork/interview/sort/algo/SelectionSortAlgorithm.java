package com.webwork.interview.sort.algo;

import java.util.Arrays;

public class SelectionSortAlgorithm {

  public static void main(String args[]){

    Integer[] numberArray = new Integer[]{4,5,3,7,2,3,3,5,6,3,5};
    Arrays.asList(numberArray).stream().forEach(System.out::print);
    System.out.println();
    Integer[] sortedArray = selectionSortAlgorithm(numberArray);
    Arrays.asList(sortedArray).stream().forEach(System.out::print);
  }

  private static Integer[] selectionSortAlgorithm(Integer[] numberArray) {
    for(int i=0; i< numberArray.length; i++){
     int minIndex = i;
      for(int j = i; j< numberArray.length; j++){
        if(numberArray[j]<numberArray[minIndex]){
        minIndex = j;
        }
      }
      int temp = numberArray[i];
      numberArray[i] = numberArray[minIndex];
      numberArray[minIndex] = temp;
    }
    return numberArray;
  }

}
