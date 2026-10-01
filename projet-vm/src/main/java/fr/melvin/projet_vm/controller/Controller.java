package fr.melvin.projet_vm.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class Controller {
    
    @GetMapping("/projet")
    public ResponseEntity<?> home() {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/pages/{num}")
    public ResponseEntity<?> getPage(@PathVariable int num) {
        return ResponseEntity.ok(null);
    }
}
