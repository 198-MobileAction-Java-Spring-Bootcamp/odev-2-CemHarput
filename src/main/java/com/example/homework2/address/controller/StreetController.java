package com.example.homework2.address.controller;

import com.example.homework2.address.dto.StreetDto;
import com.example.homework2.address.dto.StreetSaveRequestDto;
import com.example.homework2.address.service.StreetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/streets")
@RequiredArgsConstructor
public class StreetController {

    private final StreetService streetService;

    @PostMapping
    public ResponseEntity save(@RequestBody StreetSaveRequestDto streetSaveRequestDto){

        StreetDto streetDto = streetService.save(streetSaveRequestDto);

        return ResponseEntity.ok(streetDto);
    }
}
