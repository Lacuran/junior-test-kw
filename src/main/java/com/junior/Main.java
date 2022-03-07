package com.junior;

import com.junior.exception.EvenException;
import com.junior.utils.Math;

public class Main {

  public static void main(String[] args) throws EvenException {

    final Math math = new Math();

    math.getLastElementFromArray();
    math.isEven();
  }
}