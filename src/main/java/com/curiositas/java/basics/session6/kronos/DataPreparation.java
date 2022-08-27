package com.curiositas.java.basics.session6.kronos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataPreparation {

    int getNumberOfDataElements (ArrayList<String> data, int typeOfData){
        return List.of(data.get(typeOfData).split(",")).size();
    }

    List<String> prepareData(ArrayList<String> data, int typeOfData){
        return Arrays.asList(data.get(typeOfData).split(","));
    }
}
