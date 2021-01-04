# Beauty Cream Project

Jest to projekt pokazujący wzorzec Projektowy Strategia na przykładzie skóry i różnych kremów.<br/>

## Struktura 
W projekcie tym wykorzystany jest Wzorzec Projektowy Startegia.<br/>
Znajdują się w nim następujące klasy:
1. `Human` czyli człowiek, który posiada skórę
2. `Skin` - skóra. Skóra ma pozom jej nawilżenia pod postacią inta od 0 - 100 (wraz z walidacją).
3. `Cream` - interfejs kremu. Wszystkie kremy nawilżają, ale w różnych stopniu, dlatego w interfejsie jest metoda `moisturize`,<br/>
ktora przyjmuje parametr aktualnego poziomu nawilżenia skóry (`currentLevelOfMoisture`), a zwraca nowy poziom nawilżenia.
4. `MoisturizingCream` - krem nawilżający, który nawilża o 20 punktów więcej niż aktualne nawilżenie skóry
5. `SuperMoisturizingCream` - krem bardzo silnie nawilżający, który nawilża dwukrotnie więcej niż wynosi aktualny stan nawilżenia
<Br/>

## Strategia
<br/>
Każdy człowiek posiada skórę oraz jakiś krem. <br/>
Konkretny rodzaj kremu jest jednak używany dopiero w momencie nałożenia kremu na twarz - w klasie `Human` w metodzie `putOnCream`,<br/>
co składa się na Wzorzec Strategia. <br/>
Istnienie pola i klasy `Skin` nie należy do wzorca Strategii (bo jest zawsze tylko jedna skóra)

## Klasy na rysunku
Poniżej rysunek przedstawiający jak klasy ze sobą funkcjonują i jak są ze sobą połączone.
![Alt text](BeautyCreamUML.png?raw=true "Jak klasy są ze sobą połączone") <br/>
Jest jeden interfejs `Cream` i dwie jego implementacje `MoisturizingCream` oraz `SuperMoisturizingCream`. <br/>
Krem jest używany w `Human` jako pole. Podobnie skóra ma pole int reprezentujące jej poziom ustawienia oraz:<br/>
publiczne (oznaczone `+`) gettery, settery i prywatne (oznaczone `-`) metody walidujące poprawność danych. <br/>
