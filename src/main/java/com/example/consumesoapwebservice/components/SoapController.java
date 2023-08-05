package com.example.consumesoapwebservice.components;

import com.example.consumesoapwebservice.soap.NumberToDollars;
import com.example.consumesoapwebservice.soap.NumberToDollarsResponse;
import com.example.consumesoapwebservice.soap.NumberToWords;
import com.example.consumesoapwebservice.soap.NumberToWordsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SoapController {
    private final SoapClient soapClient;

    @GetMapping("/test")
    private NumberToWordsResponse numberToDollarsResponse(@RequestBody NumberToWords number){
        return this.soapClient.numberToWordsResponse(number);
    }
}
