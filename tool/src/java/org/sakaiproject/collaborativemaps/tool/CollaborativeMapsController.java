package org.sakaiproject.collaborativemaps.tool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CollaborativeMapsController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String showIndex(Model model) {
        return "index";
    }
}