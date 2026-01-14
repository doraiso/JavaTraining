package com.example.javatraining.prime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prime")
public class PrimeController {

  private final PrimeService primeService;

  public PrimeController(PrimeService primeService) {
    this.primeService = primeService;
  }

  @GetMapping
  public ResponseEntity<PrimeResult> checkPrime(@RequestParam("number") long number) {
    boolean prime = primeService.isPrime(number);
    return ResponseEntity.ok(new PrimeResult(number, prime));
  }
}
