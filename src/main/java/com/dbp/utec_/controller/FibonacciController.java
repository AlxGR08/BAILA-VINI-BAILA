package com.dbp.utec_.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {
    @GetMapping("/{n}")
    public String calculateFibonacci(@PathVariable int n) {
        if (n < 0) {
            return "El valor de n debe ser mayor o igual a 0.";
        }

        return "El término " + n + " de la sucesión de Fibonacci es: " + fibonacci(n);
    }

    private long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

}
