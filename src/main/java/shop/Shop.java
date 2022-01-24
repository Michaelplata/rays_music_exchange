package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName(){
        return  name;
    }

    public int getStockCount(){
        return stock.size();
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public double calculateProfit(){

        double totalProfit = 0;
        for(ISell item : stock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}
