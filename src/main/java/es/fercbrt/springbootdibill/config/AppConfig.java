package es.fercbrt.springbootdibill.config;

import es.fercbrt.springbootdibill.models.Item;
import es.fercbrt.springbootdibill.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {
    @Bean
    List<Item> billItems() {
        return List.of(
                new Item(new Product("Laptop", 30.0), 12),
                new Item(new Product("Mouse", 10.0), 30),
                new Item(new Product("Keyboard", 20.0), 20)
        );
    }
}
