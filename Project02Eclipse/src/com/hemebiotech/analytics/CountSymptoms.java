package com.hemebiotech.analytics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Count the number of occurrence of each symptoms in the source ArrayList of the symptoms
 */
public class CountSymptoms extends GiveAlphabeticalSymptomsList {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public CountSymptoms(String filepath) {
        super(filepath);
    }

    /**
     * @return a Map of the different symptoms order alphabetically associated with their
     * number of occurrence
     */
    protected Map<String, Integer> getSymptomsCount() {

        List<String> symptoms = super.getSymptoms();
        List<String> symptomsList = super.getAlphabeticalSymptomsList();

        // Declare and initialize a LinkedHashMap to keep alphabetical order
        Map<String, Integer> symptomsCount = new LinkedHashMap<String, Integer>();

        // Count the occurrence of each symptom present in a first ArrayList construct
        // with the input stream
        // Add each symptom and their occurrence in a Map
        for (int i = 0; i < symptomsList.size(); i++) {
            int occurrenceNumber = 1;
            for (int j = 0; j < symptoms.size(); j++) {
                if (symptomsList.get(i).equals(symptoms.get(j))) {
                    symptomsCount.put(symptomsList.get(i), occurrenceNumber);
                    occurrenceNumber++;
                }
            }
        }

        return symptomsCount;

    }

}
