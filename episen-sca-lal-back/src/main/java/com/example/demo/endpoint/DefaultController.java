package com.example.demo.endpoint;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class DefaultController {

    List<String> strings = new ArrayList<String>();

    @PostMapping("/add/order")
    public void addOrder(@RequestBody String data) throws IOException {
        strings.add(data);
        System.out.println(strings.size());

        BufferedWriter writer = new BufferedWriter(new FileWriter("./data/orders.txt", true));
        writer.write(data + " ");

        writer.close();
    }
}
