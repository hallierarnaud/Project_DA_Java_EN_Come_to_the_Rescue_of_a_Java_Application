package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class GiveSymptomsList extends ReadSymptomDataFromFile {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public GiveSymptomsList(String filepath) {
        super(filepath);
    }

    public List<String> GetSymptomsList() {

        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("C:/Users/ahallier/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
        List<String> symptoms = readSymptomDataFromFile.GetSymptoms();

        int symptomsSize = symptoms.size();
        ArrayList<String> SymptomsList = new ArrayList<String>();

        for (int i = 0; i < symptomsSize; i++) {
            if (!(SymptomsList).contains(symptoms.get(i))) {
                SymptomsList.add(symptoms.get(i));
            }
        }

        return SymptomsList;
    }

}
