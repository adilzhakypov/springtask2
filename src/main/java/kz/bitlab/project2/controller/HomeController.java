package kz.bitlab.project2.controller;

import kz.bitlab.project2.db.DBManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor(onConstructor_ = @Autowired)

public class HomeController {

    private final DBManager dbManager;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tasks", dbManager.getTasks());
        return "home";
    }

}
