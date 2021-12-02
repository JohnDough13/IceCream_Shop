package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{
    private PriceList priceList;
    private Stock stock;
    private double profit = 0;

    public IceCreamCar(){
        this(new PriceList(), new Stock());
    }

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) throws NoMoreIceCreamException {
        try {
            prepareCone(flavor);
            profit = profit + flavor.length * priceList.getBallPrice();
            return new Cone(flavor);
        } catch (NoMoreIceCreamException e){
            throw new NoMoreIceCreamException();
        }
    }

    private Cone prepareCone(Cone.Flavor[] flavor) throws NoMoreIceCreamException {
        if (stock.getBalls() <= 0) throw new NoMoreIceCreamException();
        else if (stock.getCones() <= 0) throw new NoMoreIceCreamException();
        else {
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavor.length);
            return new Cone(flavor);
        }
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        try {
            prepareIceRocket();
            profit = profit + priceList.getRocketPrice();
            return new IceRocket();
        } catch (NoMoreIceCreamException e){
            throw new NoMoreIceCreamException();
        }
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        if (stock.getIceRockets() <= 0) throw new NoMoreIceCreamException();
        else {
            stock.setIceRockets(stock.getIceRockets() - 1);
            return new IceRocket();
        }
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
        try {
            prepareMagnum(type);
            profit = profit + priceList.getMagnumPrice(type);
            return new Magnum(type);
        } catch (NoMoreIceCreamException e) {
            throw new NoMoreIceCreamException();
        }
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) throws NoMoreIceCreamException {
        if (stock.getMagni() <= 0) throw new NoMoreIceCreamException();
        else {
            stock.setMagni(stock.getMagni() - 1);
            return new Magnum(type);
        }
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
