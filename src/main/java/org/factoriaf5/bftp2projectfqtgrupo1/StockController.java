package org.factoriaf5.bftp2projectfqtgrupo1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    @GetMapping("/stocks")
    public List<Stock> allStock() {
        return List.of(
                new Stock("pant1", "pantalon", 40),
                new Stock("cam2", "camisa", 50)
        );
    }
}

