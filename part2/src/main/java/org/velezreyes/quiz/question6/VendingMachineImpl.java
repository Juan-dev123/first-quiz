package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private static volatile VendingMachineImpl instance;
  private double insertedMoney;

  private VendingMachineImpl() {
    insertedMoney = 0;
  }

  public static VendingMachine getInstance() {
    if (instance != null) {
      return instance;
    }
    synchronized (VendingMachineImpl.class) {
      if (instance == null) {
        instance = new VendingMachineImpl();
      }
      return instance;
    }
  }

  @Override
  public void insertQuarter() {
    insertedMoney += 0.25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    switch (name) {
      case "ScottCola":
        Drink scottCola = new ScottCola();
        buyDrink(scottCola);
        return scottCola;
      case "KarenTea":
        Drink karenTea = new KarenTea();
        buyDrink(karenTea);
        return karenTea;
      default:
        throw new UnknownDrinkException();
    }
  }

  private void buyDrink(Drink drink) throws NotEnoughMoneyException {
    if (insertedMoney < drink.getPrice()) {
      throw new NotEnoughMoneyException();
    }
    insertedMoney -= drink.getPrice();
  }

  @Override
  public double getInsertedMoney() {
    return insertedMoney;
  }
}
