package es.fercbrt.springbootdibill.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Value("${client.name}")
    private String name;
    @Value("${client.lastname}")
    private String lastname;
}
