package org.velezreyes.quiz.question6;

public interface VendingMachine {

  public void insertQuarter();
  public double getInsertedMoney();
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException;
}