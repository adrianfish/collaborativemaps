package org.sakaiproject.collaborativemaps.tool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.sakaiproject.collaborativemaps.api.model.CollaborativeMap;
import org.sakaiproject.collaborativemaps.api.repositories.CollaborativeMapRepository;
import org.sakaiproject.component.cover.ComponentManager;

@Controller
public class CollaborativeMapsController {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String showIndex(Model model) {

        for (String i : ComponentManager.getInstance().getRegisteredInterfaces()) {
            System.out.println(i);
        }

        /*CollaborativeMapRepository repo
            = (CollaborativeMapRepository) ComponentManager.getInstance().get("collaborativeMapRepository");
        CollaborativeMap map = new CollaborativeMap();
        map.setSiteId("BALLS");
        map.setGroupId("BALLS");
        map.setName("BALLS");
        System.out.println("Before: " + map.toString());
        map = repo.save(map);
        System.out.println("After: " + map.toString());
        for (CollaborativeMap m : repo.findAll()) {
            System.out.println(m.toString());
        }
        System.out.println("HERE");
        */
        return "index";
    }
}
