package com.webwork.interview.lambda.functionalInterfaces;

@FunctionalInterface
public interface BiFunctional <A, B, C>{
public C apply(A a, B b);
}
