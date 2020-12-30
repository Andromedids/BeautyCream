package pl.paniodprogramowania.beauty.creme;

import java.util.Random;

public class Skin {
  private int levelOfMoisture;

  public Skin(int newLevelOfMoisture) {
    checkLevelOfMoisture(newLevelOfMoisture);
  }

  public int getLevelOfMoisture() {
    return levelOfMoisture;
  }

  public void setLevelOfMoisture(int newLevelOfMoisture) {
    checkLevelOfMoisture(newLevelOfMoisture);
  }

  private void checkLevelOfMoisture(int newLevelOfMoisture) {
    if (validateLevelOfMositure(newLevelOfMoisture)) {
      this.levelOfMoisture = newLevelOfMoisture;
    } else {
      int randomLevelOfMoisture = new Random().nextInt(101) ; // 0 - 100
      System.out.println("Została podana błędna wartość " + newLevelOfMoisture +
          ". Nowy poziom nawilżenia: " + randomLevelOfMoisture);
      this.levelOfMoisture = randomLevelOfMoisture;
    }
  }

  private boolean validateLevelOfMositure(int newLevelOfMoisture){
    return newLevelOfMoisture >= 0 && newLevelOfMoisture <= 100;
  }
}
