package com.sk00sha;

import com.sk00sha.customDataStructures.RandomNumber;
import com.sk00sha.fileReader.FileLoader;
import com.sk00sha.generator.GeneratorRunner;

public class Main {
    public static void main(String[] args) {
        FileLoader loader = new FileLoader();
        try {
            var customers = loader.accessListOfTriplets("DataGenerator/src/main/resources/customer.txt");
            var items = loader.accessListOfTriplets("DataGenerator/src/main/resources/items.txt");
            GeneratorRunner runner= new GeneratorRunner(items,customers);
            runner.runGenerators();
        }catch (NullPointerException e){
            e.printStackTrace();
        }



    }
}