package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList(){
        this(1, 2, 3);
    }

    public PriceList(double rocketPrice, double ballPrice, double magnumStandardPrice){
        setRocketPrice(rocketPrice);
        setBallPrice(ballPrice);
        setMagnumStandardPrice(magnumStandardPrice);
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        if (type == Magnum.MagnumType.MILKCHOCOLATE) {
            return magnumStandardPrice * 5;
        }
        if (type == Magnum.MagnumType.WHITECHOCOLATE) {
            return magnumStandardPrice * 4;
        }
        if (type == Magnum.MagnumType.BLACKCHOCOLATE) {
            return magnumStandardPrice * 3;
        }
        if (type == Magnum.MagnumType.ALPINENUTS) {
            return magnumStandardPrice * 2;
        } else {
            return magnumStandardPrice;
        }
    }
}
