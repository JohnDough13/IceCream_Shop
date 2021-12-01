package be.intecbrussel.sellers;


//Dit schema past ook binnen de sellers package.
//We starten met het maken van de interfaces en het IceCreamSalon. De IceCreamCar zullen we later
//behandelen.
//Een IceCreamSalon stelt een ijsjeszaak voor die een ongelimiteerd aantal ijsjes heeft die ze zelf
//produceren. Je kan er ijsjes bestellen en je kan er de winst van opvragen. Ze implementeert immers
//de IceCreamSeller interface.
//Uitleg bij de implementatie van het IceCreamSalon:
//- orderCone zal op basis van een array van flavors een nieuwe cone aanmaken en teruggeven.
//Ook zal ze aan de hand van de pricelist de totalprofit waarde omhoog laten gaan.
//- orderIceRocket zal een nieuwe icerocket aanmaken en teruggeven. Ook zal ze aan de hand
//van de pricelist de totalprofit waarde omhoog laten gaan.
//- orderMagnum zal op basis van een MagnumType een nieuwe Magnum aanmaken en
//teruggeven. Ook zal ze aan de hand van de pricelist de totalprofit waarde omhoog laten
//gaan.
//Vergeet ook niet een constructor aan te maken waar je een PriceList aan kan meegeven

public interface Profitable {

    public double getProfit ();


}
