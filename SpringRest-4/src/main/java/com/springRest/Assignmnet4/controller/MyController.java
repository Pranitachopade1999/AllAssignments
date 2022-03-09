package com.springRest.Assignmnet4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.Assignmnet4.entities.CreditCard;
import com.springRest.Assignmnet4.services.CardService;

@RestController
public class MyController {

	@Autowired
    private CardService cardService;

    @PostMapping(path = "/validate")
    public String checkCreditCard(@RequestBody CreditCard creditCard)
    {
        return cardService.cardValidation(creditCard);
    }
    @GetMapping(path = "/validate")
    public CreditCard checkCard()
    {
        CreditCard creditCard = new CreditCard("Visa" , "4567890123456789012");
        return cardService.cardValidation(creditCard).equalsIgnoreCase("Valid Credit Card") ? creditCard : creditCard;
    }

}
