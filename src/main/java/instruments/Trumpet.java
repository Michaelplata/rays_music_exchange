package instruments;

public class Trumpet extends Instrument {

    String bellMaterial;

    public Trumpet(String brand, String model, double purchasePrice, double salePrice, String bellMaterial, InstrumentType instrumentType){
        super(brand, model, purchasePrice, salePrice, instrumentType);
        this.bellMaterial = bellMaterial;
    }


    public String getBellMaterial() {
        return this.bellMaterial;
    }


    @Override
    public String sound() {
        return "trumpet_sound";
    }

}
