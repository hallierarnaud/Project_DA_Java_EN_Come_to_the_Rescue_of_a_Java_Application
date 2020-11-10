package com.hemebiotech.analytics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountSymptoms extends GiveAlphabeticalSymptomsList {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public CountSymptoms(String filepath) {
        super(filepath);
    }

    protected Map<String, Integer> GetSymptomsCount() {

        List<String> symptoms = super.GetSymptoms();
        List<String> symptomsList = super.GetAlphabeticalSymptomsList();

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
