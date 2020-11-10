package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class GiveSymptomsList extends ReadSymptomDataFromFile {

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public GiveSymptomsList(String filepath) { super(filepath); }

    protected List<String> GetSymptomsList() {

        List<String> symptoms = super.GetSymptoms();

        ArrayList<String> symptomsList = new ArrayList<String>();

        for (int i = 0; i < symptoms.size(); i++) {
            if (!(symptomsList).contains(symptoms.get(i))) {
                symptomsList.add(symptoms.get(i));
            }
        }

        return symptomsList;
    }

}
