/*
package com.latesh.businessapi.controller;

import com.latesh.businessapi.SourceDestinationMapperImpl;
import com.latesh.businessapi.model.destination.Quote;
import com.latesh.businessapi.model.source.QuoteFromSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/employee")
    public ResponseEntity<Quote> getEmployee() {
        QuoteFromSource quoteFromSource = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", QuoteFromSource.class);
        System.out.println("the quote is " + quoteFromSource);

        Quote quote = new SourceDestinationMapperImpl().sourceToDestination(quoteFromSource);

        return ResponseEntity.ok(quote);
    }

}
*/
