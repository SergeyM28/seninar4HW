package org.seninar4HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int myNumber = 28;
        int myNegativeNumber = -7;
        String myAString = "Alex";
        String myAnotherString = "fedor";

        BeginsWith bwf = new BeginsWith("F");
        BeginsWithA bwa = new BeginsWithA();
        IsEven ise = new IsEven();
        IsPositive isp = new IsPositive();

        System.out.println(bwf.isGood(myAString));
        System.out.println(bwf.isGood(myAnotherString));
        System.out.println(bwa.isGood(myAString));
        System.out.println(bwa.isGood(myAnotherString));
        System.out.println(ise.isGood(myNumber));
        System.out.println(ise.isGood(myNegativeNumber));
        System.out.println(isp.isGood(myNumber));
        System.out.println(isp.isGood(myNegativeNumber));

        List<Integer> myListOfNumbers = new ArrayList<>(Arrays.asList(myNumber, myNegativeNumber));
        List<String> myListOfNames = new ArrayList<>(Arrays.asList(myAString, myAnotherString));

        System.out.println(filter(myListOfNames, bwf));
        System.out.println(filter(myListOfNumbers, ise));
    }

    static <T> Iterable<T> filter(Iterable<T> array, IsGood<T> isGoodThisTime){
        List<T> resultList = new ArrayList<>();
        for (T elem : array){
            if (isGoodThisTime.isGood(elem) == true){
                resultList.add(elem);
            }
        }
       return resultList;
    }
}