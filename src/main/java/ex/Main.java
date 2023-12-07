package ex;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    static void scriere(List<PerecheNumere> lista) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("perechi.json"), lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static List<PerecheNumere> citire() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<PerecheNumere> lista = objectMapper.readValue(new File("perechi.json"),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, PerecheNumere.class));
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Exemplu de utilizare a metodei scriere()
        List<PerecheNumere> listaPerechi = new ArrayList<>();
        listaPerechi.add(new PerecheNumere(1, 2));
        listaPerechi.add(new PerecheNumere(3, 5));
        listaPerechi.add(new PerecheNumere(4, 7));
        scriere(listaPerechi);

        // Exemplu de utilizare a metodei citire()
        List<PerecheNumere> listaCitita = citire();
        for (PerecheNumere pereche : listaCitita) {
            System.out.println(pereche);
        }
    }
}