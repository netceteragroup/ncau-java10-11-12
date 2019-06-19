package com.netcetera.ncau.java101112.var;

import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LocalVariableTypeInference {

  // var can be used in static initializers
  {
    var propertyValue = System.getProperty("someProperty");
  }

  // var cannot be used for global declarations
  // private var someList = new ArrayList<String>();

  void aJava9StyleMethod() {
    List<String> names = new ArrayList<String>();
    Stream<String> nameStream = names.stream();

    int absValue = Math.abs(-42);

    for (String name : names) {
      // ...
    }

    for (int i = 0; i < 10; i++) {
      // ...
    }

  }

  void aJava10StyleMethod() {

    // var can be used for local variables
    var names = new ArrayList<String>();

    // var can be used to store return values of methods
    var absValue = abs(-42);

    // var can be used for loop variables
    for (var name : names) {
      // ...
    }

    // var can be used for loop variables
    for (var i = 0; i < 10; i++) {
      // ...
    }
  }

  void aJava10StyleMethodWithALambda() {

    // up to java 10 var cannot be used for implicitly typed lambda parameters
    // note: final and annotations not supported on implicitly typed lambda
    // parameters
    IntStream.of(1, 2).map(i -> i * 42).forEach(System.out::println);
  }

  void aJava11StyleMethodWithALambda() {

    // with Java 11 var can be used for implicitly typed lambda parameters
    IntStream.of(1, 2).map((@TypeAnnotation var i) -> i * 42).forEach(System.out::println);

  }

  @interface TypeAnnotation {

  }
}
