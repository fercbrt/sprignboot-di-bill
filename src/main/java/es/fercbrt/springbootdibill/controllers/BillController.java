package es.fercbrt.springbootdibill.controllers;

import es.fercbrt.springbootdibill.models.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class BillController {


    @Autowired
    private Bill bill;

    @GetMapping
    Bill show() {
        return bill;
    }
}
