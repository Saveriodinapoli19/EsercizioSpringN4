package com.example.Esercizio4;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
    public class NameController {
    @Operation(summary = "Restituisce parametro nome")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK!"),
            @ApiResponse(responseCode = "400", description = "Bad Request!")
    })
    @GetMapping("/nome")
        public String getNome(@Parameter(description = "Nome passato") @RequestParam String nome){
            return nome;
        }
        @Operation(summary = "Restituisce nome al contrario")
        @ApiResponses(value = {
                @ApiResponse(responseCode = "200", description = "OK!"),
                @ApiResponse(responseCode = "400", description = "Bad Request!")
        })
        @PostMapping("/reverseName")
        public String reverseName(@Parameter(description = "Nome passato invertito")@RequestParam String nome){
            StringBuilder reverseName = new StringBuilder(nome);
            return reverseName.reverse().toString();
        }

    }


