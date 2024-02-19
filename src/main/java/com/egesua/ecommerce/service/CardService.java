package com.egesua.ecommerce.service;

import com.egesua.ecommerce.entity.Card;

import java.util.List;

public interface CardService {
    List<Card> getAllCards();
    Card getCardById(long id);
    Card saveCard(Card card);
}