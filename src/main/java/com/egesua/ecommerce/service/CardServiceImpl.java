package com.egesua.ecommerce.service;

import com.egesua.ecommerce.entity.Card;
import com.egesua.ecommerce.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService{
    private CardRepository cardRepository;
    @Autowired
    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card getCardById(long id) {
        return cardRepository.getCardById(id);
    }

    @Override
    public Card saveCard(Card card) {
        return cardRepository.save(card);
    }
}
