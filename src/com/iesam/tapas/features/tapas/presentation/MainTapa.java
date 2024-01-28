package com.iesam.tapas.features.tapas.presentation;

import com.iesam.tapas.features.tapas.data.TapaDataRepository;
import com.iesam.tapas.features.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {

    //Mostramos un listado de en este caso tapas
    public static void printTapas(){

        GetTapasFeed tapasFeed = new GetTapasFeed(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasFeed.execute();
        //Imprimimos las mascotas de una en una
        System.out.println(tapas.toString());
    }
    // Mostrar solo una tapa
    public static void printTapa(String tapaId){

        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(tapaId);
        System.out.println(tapa.toString());
    }
    //Borrar un elemento tapa
    public static void deleteTapa(String tapaId){

        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        System.out.println("Borrando tapa " + tapaId);
        deleteTapaUseCase.execute(tapaId);

    }
    //Adquirir un elemento tapa
    public static void createTapa(Tapa tapa){
        TapaDataRepository TaoaDataRepository = TapaDataRepository.newInstance();
        CreateTapaUseCase createTapaUseCase = new CreateTapaUseCase(TapaDataRepository.newInstance());
        createTapaUseCase.execute(tapa);
        System.out.println("Almacenando tapa " + tapa.getId());
    }

    //Actualizar un elemento tapa
    public static void updatePet(Tapa tapa){
        UpdateTapaUseCase updatePetUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updatePetUseCase.execute(tapa);

        System.out.println("La base de tapas ha sido actualizada");
    }


    }

