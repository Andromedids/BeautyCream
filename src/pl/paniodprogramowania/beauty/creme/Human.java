package pl.paniodprogramowania.beauty.creme;

import pl.paniodprogramowania.beauty.creme.creams.Cream;

public class Human {
  private Skin skin;
  private Cream cream;

  public Human(Skin skin, Cream cream) {
    this.skin = skin;
    this.cream = cream;
  }

  public void putOnCream(){
    System.out.println("Poziom nawilżenia skóry przed zastosowaniem kremu wynosi " + this.skin.getLevelOfMoisture());
    int newLevelOfMoisture = this.cream.moisturize(this.skin.getLevelOfMoisture()); // miejsce polimorfizmu (użycia)
    this.skin.setLevelOfMoisture(newLevelOfMoisture);
    System.out.println("Poziom nawilżenia skóry po zastosowaniu kremu wynosi " + this.skin.getLevelOfMoisture());
  }
}
