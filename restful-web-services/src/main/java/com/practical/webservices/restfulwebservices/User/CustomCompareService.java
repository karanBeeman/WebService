package com.practical.webservices.restfulwebservices.User;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class CustomCompareService {

    private static List<CustomCompareByComparator>  customCompare = new ArrayList<>();


    static {
        customCompare.add(new CustomCompareByComparator("bike", 1231));
        customCompare.add(new CustomCompareByComparator("car", 1232));
        customCompare.add(new CustomCompareByComparator("aircraft", 1233));
        customCompare.add(new CustomCompareByComparator("truck", 575));
        customCompare.add(new CustomCompareByComparator("lorry", 575));
    }


    public List<CustomCompareByComparator> customSortMethod() {
        Collections.sort(customCompare, new CustomCompareByComparator());
        return customCompare;
    }
}
