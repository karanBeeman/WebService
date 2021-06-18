package com.practical.webservices.restfulwebservices.recursive;


import com.practical.webservices.restfulwebservices.User.RecursiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class RecursiveController {

    @Autowired
    RecursiveService recursiveService;

    // It will add and return the series of number output =0 1 1 2 3 5 8 13 21 34 if input = 10
    @GetMapping(path = "/print-fibanocci-series/{number}")
    public List fibanocciSeries(@RequestParam(name= "reverse") boolean reverse, @PathVariable int number) {
        List<Integer> result = recursiveService.fibanocci(number);
        if(reverse) {
            Collections.reverse(result); //Collections will reverse only list
            return result;
        } else {
            return result;
        }
    }

    @GetMapping(path = "/frequency-vowels/{vowels}")
    public String findFrequencyVowels(@PathVariable String vowels) {
       return recursiveService.vowelsFrequency(vowels);
    }


}
