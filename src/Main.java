import com.iesam.tapas.features.tapas.data.TapaDataRepository;
import com.iesam.tapas.features.tapas.domain.Tapa;
import com.iesam.tapas.features.tapas.presentation.MainTapa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MainTapa.printTapas();
        System.out.println(" ");
        MainTapa.printTapa("1");
        System.out.println(" ");
        MainTapa.deleteTapa("2");
        // Eliminar el elemento
        Tapa newTapa = new Tapa(
                "3",
                "Panetonne",
                "Ingredientes varios de reposteria",
                "Escorial", "400",
                "4.7",
                "310",
                "50");
        MainTapa.createTapa(newTapa);
        System.out.println(" ");
        Tapa updateTapa = new Tapa(
                "3",
                "Panetonne",
                "Ingredientes varios de reposteria (Harina, Vainilla, huevo, levadura)",
                "El Escorial", "400",
                "4.7",
                "310",
                "50");
        MainTapa.updatePet(updateTapa);


        System.out.println(" ");
        MainTapa.printTapas();
    }
}