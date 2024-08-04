package es.fercbrt.springbootdibill.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Bill {

    @Autowired
    private Client client;
    @Value("${bill.description}")
    private String description;
    @Autowired
    private List<Item> items;
}
