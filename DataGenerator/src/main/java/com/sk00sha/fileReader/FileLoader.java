package com.sk00sha.fileReader;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FileLoader {
    private List<String> itemsList;
    private List<String> customerList;
    public FileLoader(){
        File itemFile = new File("DataGenerator/src/main/resources/items.txt");
        File customerFile = new File("DataGenerator/src/main/resources/customer.txt");
        try {
            if (!itemFile.exists() || !customerFile.exists()){
                throw new FileNotFoundException("Invoking file not found exception...");
            }
            else {
                setCustomerList(readFileWithObjects(customerFile));
                setItemsList(readFileWithObjects(itemFile));
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }

    private List<String> readFileWithObjects(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));;
        List<String> arrayListItems = new ArrayList<>();
        String data = reader.readLine();
        while (data != null && !data.isEmpty()) {
            arrayListItems.add(data);
            data = reader.readLine();
        }

        return arrayListItems;
    }

}
