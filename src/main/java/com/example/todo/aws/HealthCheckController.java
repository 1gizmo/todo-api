package com.example.todo.aws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HealthCheckController {

    @GetMapping("/")
    public ResponseEntity<?> healthCheck() {
        log.info("server is runing ... im healthy!");
        return ResponseEntity.ok().body("it's ok!");
    }
}
