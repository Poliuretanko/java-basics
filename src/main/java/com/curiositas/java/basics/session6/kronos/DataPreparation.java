package com.curiositas.java.basics.session6.kronos;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataPreparation {

    int getNumberOfDataElements (@NotNull ArrayList<String> data, int typeOfData){
        return List.of(data.get(typeOfData).split(",")).size();
    }

    List<String> prepareData(@NotNull ArrayList<String> data, int typeOfData){
        return Arrays.asList(data.get(typeOfData).split(","));
    }
}
