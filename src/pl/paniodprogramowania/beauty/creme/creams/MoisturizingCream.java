package pl.paniodprogramowania.beauty.creme.creams;

public class MoisturizingCream implements Cream {

  @Override
  public int moisturize(int currentLevelOfMoisture) {
    return currentLevelOfMoisture + 20;
  }
}
