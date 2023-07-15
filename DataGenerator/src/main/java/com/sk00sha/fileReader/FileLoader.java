package com.sk00sha.fileReader;

import com.sk00sha.customDataStructures.MyTriplet;
import lombok.Setter;
import org.mockito.internal.matchers.Null;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


@Setter
public class FileLoader {
    private List<String> listOfObjects;
    public FileLoader(){}
    private void loadFile(String fileName){
        File itemFile = new File(fileName);
        try {
            if (!itemFile.exists()){
                throw new FileNotFoundException("Couldn't find the file specified");
            }
            setListOfObjects(readFileWithObjects(itemFile));
        } catch (IOException e){
            System.out.println("cannot load file");
        }

    }
    public List<MyTriplet<String,String,String>>accessListOfTriplets(String tripletFile){
        DataSplitter splitter = new DataSplitter();
        loadFile(tripletFile);

        return splitter.addStringsToTuples(this.listOfObjects);

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
    private class DataSplitter {
        /**
         * @param stringList list of String with : delimited fields
         * @return list of triplets
         */
        private List<MyTriplet<String, String, String>> addStringsToTuples(List<String> stringList) {
            if (stringList == null){
                throw new NullPointerException("We got a situation here, stopping exec");
            }
            List<MyTriplet<String, String, String>> tripletList = new ArrayList<>();
            for (String row : stringList) {
                    MyTriplet<String, String, String> triplet = new MyTriplet<>(row.split(":")[0], row.split(":")[1], row.split(":")[2]);
                    tripletList.add(triplet);
            }

            return tripletList;
        }
    }
}
