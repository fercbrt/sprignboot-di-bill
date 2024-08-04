package es.fercbrt.springbootdibill.config;

import es.fercbrt.springbootdibill.models.Item;
import es.fercbrt.springbootdibill.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
    @Bean
    List<Item> otherBillItems() {
        return List.of(
                new Item(new Product("Monitor", 300.0), 3),
                new Item(new Product("HDMI Cable", 5.0), 10),
                new Item(new Product("VGA Cable", 2.0), 20),
                new Item(new Product("USB Cable", 3.0), 30),
                new Item(new Product("Ethernet Cable", 2.0), 20),
                new Item(new Product("Power Cable", 3.0), 30)
        );
    }
}
