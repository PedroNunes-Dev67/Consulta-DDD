package PedroNunesDev.ConsultaDDD.service;

import PedroNunesDev.ConsultaDDD.model.ExceptionDDD;
import PedroNunesDev.ConsultaDDD.model.DDD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class DDDService {

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<?> buscarDDD(String dddRequest){

        try {
            return restTemplate.getForEntity("https://brasilapi.com.br/api/ddd/v1/" + dddRequest, DDD.class);
        }
        catch (HttpClientErrorException e){
            return ResponseEntity.status(e.getStatusCode()).body(e.getResponseBodyAs(ExceptionDDD.class));
        }
        catch (HttpServerErrorException e){
            return ResponseEntity.status(e.getStatusCode()).body(null);
        }
    }
}
