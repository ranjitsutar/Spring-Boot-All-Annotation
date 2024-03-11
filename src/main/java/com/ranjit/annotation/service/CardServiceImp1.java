package com.ranjit.annotation.service;


import org.springframework.stereotype.Component;

@Component("card1")
public class CardServiceImp1 implements CardService{
    @Override
    public void addCard() {
        System.out.println("Card Service 1");
    }
}
