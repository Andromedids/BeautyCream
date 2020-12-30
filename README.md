# Beauty Cream Project

Jest to projekt pokazujący wzorzec Projektowy Strategia na przykładzie skóry i różnych kremów.<br/>

## Strategia 
W projekcie tym wykorzystany jest Wzorzec Projektowy Startegia.<br/>
Znajdują się w nim następujące klasy:
1. `Human` czyli człowiek
2. `Skin` - skóra. Skóra ma pozom jej nawilżenia pod postacią inta od 0 - 100 (wraz z walidacją)
3. `Cream` - interfejs kremu. Wszystkie kremy nawilżają, ale w różnych stopniu. 
4. `MoisturizingCream` - krem nawilżający
5. `SuperMoisturizingCream` - krem bardzo silnie nawilżający
<Br/>

<br/>
Każdy człowiek posiada skórę oraz jakiś krem. <br/>
Konkretny rodzaj kremu jest jednak używany dopiero w momencie uruchmienia (w klasie `Main`),<br/>
co składa się na Wzorzec Strategia.