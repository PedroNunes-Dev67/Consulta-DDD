package PedroNunesDev.ConsultaDDD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PedroNunesDev.ConsultaDDD.model.DDD;
import PedroNunesDev.ConsultaDDD.service.DDDService;

@CrossOrigin(origins= "http://localhost:5500")
@RestController
@RequestMapping("/ddd")
public class DDDController {

    @Autowired
    private DDDService dddService;

    @GetMapping("/{ddd}")
    public ResponseEntity<?> buscarDDD(@PathVariable("ddd") String dddRequest){

        ResponseEntity<?> response = dddService.buscarDDD(dddRequest);

        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }
}
