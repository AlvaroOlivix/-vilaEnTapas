package com.iesam.tapas.features.tapas.domain;

import java.util.ArrayList;

//Los casos de uso solo tienen un método público
public class GetTapasFeed {
    private TapaRepository tapaRepository;

    public GetTapasFeed(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public ArrayList<Tapa> execute(){
        return tapaRepository.obtainTapas();

    }
}
