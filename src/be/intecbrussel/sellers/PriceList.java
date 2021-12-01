package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;


//1.2 Prijslijst /2

//Dit schema hoort bij de sellers package en zal de prijzen van de ijsjes bijhouden. De getmagnumprice
//methode zal aan de hand van een gegeven MagnumType en een algemeen opgegeven
//magnumStandardPrice teruggeven wat de prijs van zo’n magnum zal zijn. Bv: Een alpinenuts
//magnum zal 1.5 keer de prijs zijn van een standaard magnum.


public class PriceList {

    double ballPrice;

    double rocketPrice;

    double magnumStandardPrice;

    public PriceList ();

    public PriceList(double, double, double);

    public void setBallPrice(double);

    public void setRocketPrice(double);

    public void setMagnumStandardPrice (double);

    public double getBallPrice();

    public double getRocketPrice();

    public double getMagnumStandardPrice(Magnum.MagnumType);


}
