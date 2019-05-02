package com.nomad.nomad.Controller;

import com.nomad.nomad.Service.VocabularyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VocabularyController {

    @Autowired
    VocabularyService vocabularyService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showVocabularyList(ModelMap model) {
        model.put("vocabularyList", vocabularyService.retrieveVocabulary());
        return "list";
    }

}
