package es.fercbrt.springbootdibill.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Bill {

    @Autowired
    private Client client;
    @Value("${bill.description}")
    private String description;
    @Autowired
    @Qualifier("otherBillItems")
    private List<Item> items;

    public Double getTotal() {
        return items.stream().mapToDouble(Item::getTotal).sum();
    }
}
