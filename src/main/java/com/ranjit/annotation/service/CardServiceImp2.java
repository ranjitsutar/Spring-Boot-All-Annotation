package com.ranjit.annotation.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("card2")
public class CardServiceImp2 implements  CardService{

    public void addCard() {
        System.out.println("Card Service 2");
    }
}
