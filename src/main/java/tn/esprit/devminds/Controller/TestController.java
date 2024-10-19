package tn.esprit.devminds.Controller;//package tn.esprit.devminds.Controllers;
//
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/test")
//@CrossOrigin(origins = "http://localhost:4200")
//public class TestController {
//
//    @GetMapping("/all")
//    public String allAccess() {
//        return "Public Content.";
//    }
//
//    @GetMapping("/user")
//    @PreAuthorize("hasRole('USER') or hasRole('COMPANY') or hasRole('ADMIN')")
//    public String userAccess() {
//        return "User Content.";
//    }
//
//    @GetMapping("/comp")
//    @PreAuthorize("hasRole('COMPANY')")
//    public String moderatorAccess() {
//        return "Company Board.";
//    }
//
//    @GetMapping("/admin")
//    @PreAuthorize("hasRole('ADMIN')")
//    public String adminAccess() {
//        return "Admin Board.";
//    }
//
//}
