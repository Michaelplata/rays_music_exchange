package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String brand;
    private String model;
    private InstrumentType instrumentType;
    private double purchasePrice;
    private double salePrice;


    public Instrument(String brand, String model, double purchasePrice, double salePrice, InstrumentType instrumentType) {
        this.brand = brand;
        this.model = model;
        this.instrumentType = instrumentType;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }


    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getPurchasePrice(){
        return this.purchasePrice;
    }

    public double getSalePrice(){
        return this.salePrice;
    }

    public double calculateMarkup(){
        return this.salePrice - this.purchasePrice;
    }

    @Override
    public abstract String sound() ;


 }
