package com.skypro.spring.controllers;

import com.skypro.spring.service.BusketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BusketController {

    private final BusketService busketService;

    public BusketController(BusketService busketService) {
        this.busketService = busketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> ids){
        return busketService.add(ids);
    }
    @GetMapping("/get")
    public List<Integer> get(){
        return busketService.get();
    }
}
