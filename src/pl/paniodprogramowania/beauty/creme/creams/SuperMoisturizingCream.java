package pl.paniodprogramowania.beauty.creme.creams;

public class SuperMoisturizingCream implements Cream {

  @Override
  public int moisturize(int currentLevelOfMoisture) {
    return currentLevelOfMoisture * 2;
  }
}
