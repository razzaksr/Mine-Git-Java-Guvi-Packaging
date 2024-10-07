package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repository {
    private List<Product> myProducts= Stream.of(
            new Product(1234,"Nike",900.5),
                    new Product(1232,"Rebok",334.4),
                    new Product(1224,"Adida",543.4)
            )
            .collect(Collectors.toList());
    public void showSome(){
        System.out.println(myProducts);
    }
}
