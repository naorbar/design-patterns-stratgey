package com.ca.hr.beans;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomNameGenerator {
    
    public String generate() {
        
        List<String> names = new ArrayList<>();
        
        names.add("Peter");
        names.add("Roland");
        names.add("Lucy");
        names.add("John");
        names.add("Robert");
        names.add("Jane");
        
        Random r = new Random();
        int i = r.nextInt(names.size());
        
        return names.get(i);
    }
}