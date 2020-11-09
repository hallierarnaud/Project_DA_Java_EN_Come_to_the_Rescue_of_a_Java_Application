package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountSymptoms extends GiveSymptomsList {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public CountSymptoms(String filepath) {
        super(filepath);
    }

    public Map<String, Integer> GetSymptomsCount() {

        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("C:/Users/ahallier/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
        List<String> symptoms = readSymptomDataFromFile.GetSymptoms();

        GiveSymptomsList giveSymptomsList = new GiveSymptomsList("C:/Users/ahallier/IdeaProjects/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
        List<String> symptomsList = giveSymptomsList.GetSymptomsList();

        Map<String, Integer> symptomsCount = new LinkedHashMap<String, Integer>();

        for (int i = 0; i < symptomsList.size(); i++) {
            int occurenceNumber = 1;
            for (int j = 0; j < symptoms.size(); j++) {
                if (symptomsList.get(i).equals(symptoms.get(j))) {
                    symptomsCount.put(symptomsList.get(i), occurenceNumber);
                    occurenceNumber++;
                }
            }
        }

        return symptomsCount;

    }



}
