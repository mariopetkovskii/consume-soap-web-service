package com.example.consumesoapwebservice.components;

import com.example.consumesoapwebservice.soap.NumberToDollars;
import com.example.consumesoapwebservice.soap.NumberToDollarsResponse;
import com.example.consumesoapwebservice.soap.NumberToWords;
import com.example.consumesoapwebservice.soap.NumberToWordsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
@RequiredArgsConstructor
public class SoapClient {
    private final Jaxb2Marshaller marshaller;

    private WebServiceTemplate webServiceTemplate;

    public NumberToWordsResponse numberToWordsResponse(NumberToWords NumberToWords){
        webServiceTemplate = new WebServiceTemplate(marshaller);
        NumberToWordsResponse NumberToWordsResponse = (NumberToWordsResponse) webServiceTemplate.marshalSendAndReceive("https://www.dataaccess.com/webservicesserver/NumberConversion.wso", NumberToWords);
        return NumberToWordsResponse;
    }

}
