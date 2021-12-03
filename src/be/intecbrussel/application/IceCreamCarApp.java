package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamCarApp{
    public static void main(String[] args) {
        PriceList priceList = new PriceList(4, 4.5, 2);
        Stock stock = new Stock(2, 2, 4, 1);
        IceCreamSeller iceCreamCar = new IceCreamCar(priceList, stock);
        Cone.Flavor[] flavor = {Cone.Flavor.STRAWBERRY, Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.PISTACHE};

        IceRocket iceRocket = iceCreamCar.orderIceRocket();
        Magnum magnum = iceCreamCar.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        Magnum magnum1 = iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);
        Cone cone = iceCreamCar.orderCone(flavor);

        Eatable[] eatables = {iceRocket, magnum, magnum1, cone};
        for (int i = 0; i < eatables.length; i++){
            eatables[i].eat();
        }
        System.out.println("profit of " + iceCreamCar.getProfit() + " euro");
    }
}
