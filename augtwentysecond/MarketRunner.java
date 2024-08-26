package com.xworkz.augtwentysecond;

public class MarketRunner {
    public static void main(String[] args) {
        MarketStore marketStore = new MarketStore();

        MarketData market1 = new MarketData("Big Bazaar", "Bangalore");
        MarketData market2 = new MarketData("Reliance", "Mumbai");
        MarketData market3 = new MarketData("Spencer's", "Chennai");
        MarketData market4 = new MarketData("More", "Hyderabad");
        MarketData market5 = new MarketData("Easy Day", "Delhi");

        marketStore.save(market1);
        marketStore.save(market2);
        marketStore.save(market3);
        marketStore.save(market4);
        marketStore.save(market5);

        marketStore.display();
    }
}

