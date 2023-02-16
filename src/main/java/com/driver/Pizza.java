package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int toppings;

    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;
        }
        else{
            this.price = 400;
            this.toppings = 120;
        }

        // optional do for good practice
        isBillCreated = false;
        isExtraCheeseAdded = false;
        isExtraToppingAdded = false;
        isTakeAway = false;

        // the base price will be set here only
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        // check if already cheese added or not
        if(!isExtraCheeseAdded){
            this.price += 80;
            isExtraCheeseAdded = true; // only once we have to add so
        }
    }

    public void addExtraToppings(){

        // check if already toppings added or not
        if(!isExtraToppingAdded){
            this.price += this.toppings;
            isExtraToppingAdded = true; // only once we have to add so
        }
    }

    public void addTakeaway(){

        // check if takeaway is added or not
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true; // only once we have to add so
        }
    }

    public String getBill(){

        if(!isBillCreated){
            if(isExtraCheeseAdded){
                this.bill += "Extra Cheese Added: 80"+"\n";
            }

            if(isExtraToppingAdded){
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            }

            if(isTakeAway){
                this.bill += "Paperbag Added: 20"+"\n";
            }

            this.bill += "Total Price: "+this.price+"\n";

            isBillCreated = true; // to avoid making multiple bills

//            return this.bill+"\n";
        }
        return this.bill+"\n";
    }
}
