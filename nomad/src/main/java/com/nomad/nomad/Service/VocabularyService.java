package com.nomad.nomad.Service;

import com.nomad.nomad.Model.vocabulary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Component
public class VocabularyService {
    private static List<vocabulary> vocabularylist = new ArrayList<>();
    //private static int vocabularyCount = 2;

    static {
        vocabularylist.add(new vocabulary(1, "apple"));
        vocabularylist.add(new vocabulary(2, "happy"));
    }


    public List<vocabulary> retrieveVocabulary() {
        List<vocabulary> filteredVocabulary = new ArrayList<>();
        for (vocabulary vocabulary : vocabularylist) {
            filteredVocabulary.add(vocabulary);
        }
        return filteredVocabulary;
    }


    public void addVocabulary(int id, String content) {
        vocabularylist.add(new vocabulary(id, content));
    }

    public void remove(int id) {
        Iterator<vocabulary> iterator = vocabularylist.iterator();
        while (iterator.hasNext()) {
            vocabulary vocabulary = iterator.next();
            if (vocabulary.getId() == id) {
                iterator.remove();
            }

        }
    }
}

