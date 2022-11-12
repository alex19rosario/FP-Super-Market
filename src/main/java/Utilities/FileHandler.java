package Utilities;

import Entities.Hallway;
import Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class FileHandler {

    private static final String path = "/home/carlos/Desktop/Hallways.csv";

    public static Supplier<List<Hallway>> readHallways(){
        Supplier<List<Hallway>> supplier = () -> {
            List<Hallway> hallwayList = new ArrayList<>();
            try {
                File file = new File(path);
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                String line = "";
                while((line = br.readLine()) != null){
                    Hallway hallway = new Hallway(line, new ArrayList<Product>());
                    hallwayList.add(hallway);
                }
                br.close();

            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                return Collections.unmodifiableList(hallwayList);
            }
        };
        return supplier;
    }
}
