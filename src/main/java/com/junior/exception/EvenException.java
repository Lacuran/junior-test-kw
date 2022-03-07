package com.junior.exception;

public class EvenException extends Exception {
  public EvenException(final Integer number) {
    super("Number " + number + " is not even!");
  }
}
