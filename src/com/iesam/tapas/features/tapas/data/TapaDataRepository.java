package com.iesam.tapas.features.tapas.data;

import com.iesam.tapas.features.tapas.domain.DeleteTapaUseCase;
import com.iesam.tapas.features.tapas.domain.Tapa;
import com.iesam.tapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;
import java.util.List;

public class TapaDataRepository implements TapaRepository {

    //Patron Singleton
    private static TapaDataRepository instance = null;

    public static TapaDataRepository newInstance(){
        if (instance==null){
            instance = new TapaDataRepository();
        }
        return instance;

    }
    private TapaDataRepository() {
        initData();
    }

    private ArrayList<Tapa> tapaslocal = new ArrayList<>();
    private void initData() {
        tapaslocal.add(new Tapa("1", "Perdiz en salsa", "Perdiz, Verduras y agua", "Bar Gentes", "280", "4.4", "173", "27"));
        tapaslocal.add(new Tapa("2", "Flan de Higos", "Flan de Higos", "Bar Mr.Platon", "260", "4.2", "202", "31"));

    }
 /* CRUD :
    C reate
    R ead
    U pdate
    D elete
  */
    //Crear/Almacenar una tapa

    @Override
    public void createTapa(Tapa tapa) {
        tapaslocal.add(tapa);
    }



    //Leer/Obtener una lista de tapas
    @Override
    public ArrayList<Tapa> obtainTapas() {

        return tapaslocal;
    }

    //Leer/Obtener una sola Tapa
    @Override
    public Tapa obtainTapa(String tapaId) {
        for (Tapa tapa : tapaslocal) {
            if (tapa.getId().equals(tapaId)) {
                return tapa;
            }
        }
        return null;
    }
    //Actualizar un elemento tapa.

    @Override
    public void updateTapa(Tapa tapa) {
        deleteTapa(tapa.getId());
        createTapa(tapa);
    }
    //Borrar una Tapa

    @Override
    public void deleteTapa (String tapaId) {
        for (int i=0; i<tapaslocal.size(); i++) {
            if (tapaslocal.get(i).getId().equals(tapaId))
                tapaslocal.remove(i);
        }
    }
}
