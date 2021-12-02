package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(4, 4.5, 2);
        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);
        Cone.Flavor[] flavor = {Cone.Flavor.STRAWBERRY, Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.PISTACHE};
        IceRocket iceRocket = iceCreamSalon.orderIceRocket();
        Magnum magnum = iceCreamSalon.orderMagnum(Magnum.MagnumType.ROMANTICSTRAWBERRIES);
        Cone cone = iceCreamSalon.orderCone(flavor);
        Eatable[] eatables = {iceRocket, magnum, cone};
        for (int i = 0; i < eatables.length; i++){
            eatables[i].eat();
        }
        System.out.println(iceCreamSalon.toString());
    }
}
