package pl.paniodprogramowania.beauty.creme;

import pl.paniodprogramowania.beauty.creme.creams.Cream;
import pl.paniodprogramowania.beauty.creme.creams.MoisturizingCream;
import pl.paniodprogramowania.beauty.creme.creams.SuperMoisturizingCream;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------- Maja --------");
        Skin skinMaja = new Skin(70);
        Cream dove = new SuperMoisturizingCream(); //pisanie pod interfejs
        Human maja = new Human(skinMaja, dove);
        maja.putOnCreme();

        System.out.println("-------- Ania --------");
        Skin skinAnia = new Skin(20);
        Cream nivea = new MoisturizingCream(); //pisanie pod interfejs
        Human ania = new Human(skinAnia, nivea);
        ania.putOnCreme();

    }
}
