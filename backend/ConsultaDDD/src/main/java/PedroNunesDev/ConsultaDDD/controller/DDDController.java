package PedroNunesDev.ConsultaDDD.controller;

import PedroNunesDev.ConsultaDDD.model.DDD;
import PedroNunesDev.ConsultaDDD.service.DDDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ddd")
public class DDDController {

    @Autowired
    private DDDService dddService;

    @GetMapping("/{ddd}")
    public ResponseEntity<DDD> buscarDDD(@PathVariable("ddd") String dddRequest){

        return dddService.buscarDDD(dddRequest);
    }
}
