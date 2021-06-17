package com.practical.webservices.restfulwebservices.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecursiveService {

    @Autowired
    private RecursiveBean recursiveBean;

    public List fibanocci(int number) {

        int num1 = 0, num2 = 1;

        int counter = 0;

        List<Integer> addSequence = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        while (counter < number) {
            // Print the number
//           sb.append(num1);
//           sb.append(" ");
            addSequence.add(num1);

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }

        return addSequence;
    }

    public String vowelsFrequency(String str) {
        int cnt[] = new int[5];
        String vowels = "aeiou";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {

            if (str.toLowerCase().charAt(i) == 'a') {
                cnt[0]++;
            }
            if (str.toLowerCase().charAt(i) == 'e') {
                cnt[1]++;
            }
            if (str.toLowerCase().charAt(i) == 'i') {
                cnt[2]++;
            }
            if (str.toLowerCase().charAt(i) == 'o') {
                cnt[3]++;
            }
            if (str.toLowerCase().charAt(i) == 'u') {
                cnt[4]++;
            }
        }

      for(int j=0; j< cnt.length; j++) {
         for(int k=j; k<=j; k++) {
             sb.append("frequency of ");
             sb.append(vowels.charAt(k));
             sb.append(" = ");
             sb.append(cnt[k]);
             sb.append(", ");
         }
      }
        return sb.toString();
    }




}


