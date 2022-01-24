package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String brand, String model, double purchasePrice, double salePrice, InstrumentType instrumentType, int numberOfStrings) {
        super(brand, model, purchasePrice, salePrice, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public String sound(){
        return "guitar_sound";

    }


}
