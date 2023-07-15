package com.sk00sha;

import com.sk00sha.customDataStructures.RandomNumber;
import com.sk00sha.fileReader.FileLoader;

public class Main {
    public static void main(String[] args) {
        FileLoader loader = new FileLoader();
        try {
            var data = loader.accessListOfTriplets("DataGenerator/src/main/resources/customer.txt");
            System.out.println(RandomNumber.getRandomIntNumber(0, 40));
            System.out.println(data.get(data.size()-1));
        }catch (NullPointerException e){
            e.printStackTrace();
        }



    }
}