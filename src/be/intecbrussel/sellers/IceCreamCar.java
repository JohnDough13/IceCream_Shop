package be.intecbrussel.sellers;

import be.intecbrussel.application.Stock;
import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar {

    public PriceList priceList;
    public Stock stock;
    double profit;

    public Cone orderCone(Cone.Flavor[]);

    public Cone prepareCone (Cone.Flavor[]);

    public IceRocket orderIceRocket ();

    public IceRocket prepareIceRocket ();

    public Magnum orderMagnum(Magnum.MagnumType);

    public Magnum prepareMagnum (Magnum.MagnumType);

    double getProfit();

    


//    1.6 IceCreamCar /4
//Zie het schema bij 1.3.
//We gaan een 2e
//soort icecreamseller definiëren, de icecreamcar. Deze zal een eindige voorraad ijsjes
//hebben. Ze gaat dus gebruik maken van een stock.
//Zorg dus ook dat je aan een constructor zowel een pricelist als een stock meegeven kan.
//De orderMethoden zijn grotendeels hetzelfde als bij een IceCreamSalon, alleen dat je nu ook
//rekening moet houden met de stock. Indien er van een bepaald ijsje geen voorraad meer is, gooi je
//een NoMoreIceCreamException. Deze vang je dan eventueel later op in je programma. De
//ordermethoden geven in ieder geval normaal gezien nooit een null waarde terug.
//De prepareCone, prepareRocket en prepareMagnum methoden zijn private en dienen eerder als
//hulpmethoden gebruikt te worden binnen je ordermethoden om het boeltje clean te houden.
}
