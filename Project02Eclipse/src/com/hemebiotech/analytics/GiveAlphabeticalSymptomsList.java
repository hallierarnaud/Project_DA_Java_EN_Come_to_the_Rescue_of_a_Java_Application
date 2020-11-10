package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GiveAlphabeticalSymptomsList extends ReadSymptomDataFromFile {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public GiveAlphabeticalSymptomsList(String filepath) { super(filepath); }

    protected List<String> GetAlphabeticalSymptomsList() {

        List<String> symptoms = super.GetSymptoms();

        ArrayList<String> alphabeticalSymptomsList = new ArrayList<String>();

        for (int i = 0; i < symptoms.size(); i++) {
            if (!(alphabeticalSymptomsList).contains(symptoms.get(i))) {
                alphabeticalSymptomsList.add(symptoms.get(i));
            }
        }

        Collections.sort(alphabeticalSymptomsList);

        return alphabeticalSymptomsList;
    }

}
