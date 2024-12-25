package com.webwork.interview.sort.algo;

import java.util.Arrays;

public class QuickSortAlgorithm {

  public static void main(String args[]){

    Integer[] numberArray = new Integer[]{4,5,3,7,2,3,3,5,6,3,5};
    Arrays.asList(numberArray).stream().forEach(System.out::print);
    System.out.println();
    Integer[] sortedArray = quickSortAlgorithm(numberArray);
    Arrays.asList(sortedArray).stream().forEach(System.out::print);
  }

  private static Integer[] quickSortAlgorithm(Integer[] numberArray) {
    return null;
  }
}
