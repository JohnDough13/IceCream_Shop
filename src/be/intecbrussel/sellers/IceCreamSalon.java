package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList priceList;
    private double totalProfit = 0;

    public IceCreamSalon(){
        this(new PriceList());
    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {
        totalProfit = totalProfit + flavor.length * priceList.getBallPrice();
        return new Cone(flavor);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit = totalProfit + priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        totalProfit = totalProfit + priceList.getMagnumPrice(type);
        return new Magnum(type);
    }

    @Override
    public String toString() {
        return "profit of " + getProfit() + " euro";
    }
}
