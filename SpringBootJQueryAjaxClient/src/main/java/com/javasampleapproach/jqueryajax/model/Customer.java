package com.javasampleapproach.jqueryajax.model;

public class Customer {
    private String textToEncrypt;

    public Customer(){}
     
    public Customer(String textToEncrypt){
        this.textToEncrypt = textToEncrypt;
    }
     
    // firstname
    public String getTextToEncrypt() {
        return textToEncrypt;
    }

    public void setTextToEncrypt(String textToEncrypt) {
        this.textToEncrypt = textToEncrypt;
    }
}