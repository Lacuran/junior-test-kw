package com.junior.utils;

import com.junior.exception.EvenException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Math {

  private final List<String> test = new ArrayList<>();

  public Math() {
    addItemsToList();
  }

  private void addItemsToList() {
    Collections.addAll(test, "Element1", "Element2", "Element3", "Element4");
  }

  public final String getLastElementFromArray() {
    final String myElement = test.get(FileUtils.getIndex());
    System.out.println("Last element is: " + myElement);
    return myElement;
  }

  public void isEven() throws EvenException {
    final var myNumber = FileUtils.getNumber();

    if (myNumber % 2 == 0) {
      System.out.println(myNumber + " it's even number!");
    } else {
      throw new EvenException(myNumber);
    }
  }
}
