package pcf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pcf.demo.service.MemberServiceImpl;
import pcf.demo.service.TeamServiceImpl;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

//    @GetMapping(value = "/")
//    public String index() {
//        System.out.println("test");
//        return "index.html";
//    }

    @Autowired
    private TeamServiceImpl teamService;

    @Autowired
    private MemberServiceImpl memberService;

    @GetMapping(value = "/teams")
    public ResponseEntity getAllTeams() {
        return ResponseEntity.status(HttpStatus.OK).body(teamService.getAll());
    }

    @GetMapping(value = "/teams/{id}")
    public ResponseEntity getById(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(teamService.getById(id));
    }

    @GetMapping(value ="/members")
    public ResponseEntity getAllMembers(){
        return ResponseEntity.status(HttpStatus.OK).body(memberService.getAll());
    }
}

