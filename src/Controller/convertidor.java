/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
/**
 *
 * @author RODX & JonhDuranM
 */
public class convertidor {
    
    private String currency;
    private String currencyDefault;
    private double price;
    public double ValueConverting;
    public double value;
    
    public void setCurrency(String CurrencyValue){
        this.currency = CurrencyValue;
    };

    public void setCurrencyDefault(String CurrencyDefault){
        this.currencyDefault = CurrencyDefault;
    };
    
    public void setValue(double priceValue){
        this.price = priceValue;
    };
    
    public String getCurrency(){
        return currency;
    };
    
    public double getPrice(){
        return price;
    };
    
    public double addValue(double value){
        this.value = value;
        return this.value;
    };    
    
    public double convertCurrency(){
        this.ValueConverting = this.value * this.price;
        return this.ValueConverting;
    };
};

