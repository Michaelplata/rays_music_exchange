package instruments;

public class Piano extends Instrument {
    private int numberOfKeys;


    public Piano(String brand, String model, double purchasePrice, double salePrice, int numberOfKeys, InstrumentType instrumentType) {
        super(brand, model, purchasePrice, salePrice, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfStrings(){
        return numberOfKeys;
    }

    @Override
    public String sound() {
        return "piano_sound";
    }

}
