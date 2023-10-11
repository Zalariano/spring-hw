package com.skypro.spring.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BusketService {
    public List<Integer> itemes = new ArrayList<>();

    public List<Integer> add(List<Integer> ids) {
        itemes.addAll(ids);
        return ids;

    }

    public List<Integer> get() {
        return itemes;
    }
}
