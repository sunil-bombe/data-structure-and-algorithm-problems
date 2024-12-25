package com.webwork.interview.leetcode.problems;

import java.util.HashMap;

import java.util.Map;


public class UnionOfTwoSortedArray {

  public static void main(String[] args){

    int[] firstArray = {1,2,3,4,5,6,7};

    int[] secondArray = {5,6,7,8,9,10,11};

    int len = (firstArray.length > secondArray.length) ? firstArray.length : secondArray.length;
    Map<Integer, Integer> unionMap = new HashMap<Integer, Integer>();
    for(int i = 0; i < len; i++){
      if(i < firstArray.length){
        if(!unionMap.containsKey(firstArray[i])){
          unionMap.put(firstArray[i], firstArray[i]);
        }
      }
      if(i < secondArray.length){
        if(!unionMap.containsKey(secondArray[i])){
          unionMap.put(secondArray[i],secondArray[i]);
        }
      }
    }
    unionMap.keySet().stream().forEach(System.out:: println);

  }
}
