package pcf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pcf.demo.bean.TeamBean;
import pcf.demo.service.TeamService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

//    @GetMapping(value = "/")
//    public String index() {
//        System.out.println("test");
//        return "index.html";
//    }

    @Autowired
    private TeamService teamService;

    @GetMapping(value = "/teams")
    public List<TeamBean> getAllTeams() {
        return teamService.getAll();
    }
}

