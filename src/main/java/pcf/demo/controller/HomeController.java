package pcf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pcf.demo.service.TeamServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/teams")
public class HomeController {

//    @GetMapping(value = "/")
//    public String index() {
//        System.out.println("test");
//        return "index.html";
//    }

    @Autowired
    private TeamServiceImpl teamService;

    @GetMapping(value = "")
    public ResponseEntity getAllTeams() {
        return ResponseEntity.status(HttpStatus.OK).body(teamService.getAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(teamService.getById(id));
    }
}

