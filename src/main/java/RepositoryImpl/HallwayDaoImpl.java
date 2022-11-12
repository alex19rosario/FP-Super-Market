package RepositoryImpl;

import Entities.Hallway;
import Repository.HallwayDao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static Utilities.FileHandler.readHallways;

public class HallwayDaoImpl implements HallwayDao {

    @Override
    public Supplier<List<Hallway>> findAll() {
        Supplier<List<Hallway>> supplier = () -> readHallways().get();
        return supplier;
    }
}
