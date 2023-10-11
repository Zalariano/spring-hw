package com.skypro.spring.service;

import com.skypro.spring.model.Busket;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BusketService {
    private final Busket busket;

    public BusketService(Busket busket) {
        this.busket = busket;
    }

    public List<Integer> add(List<Integer> ids) {
        return busket.add(ids);

    }

    public Map<Integer, Integer> get() {
        return busket.get();
    }
}
