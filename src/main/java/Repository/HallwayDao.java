package Repository;

import Entities.Hallway;

import java.util.List;
import java.util.function.Supplier;

public interface HallwayDao {

    public Supplier<List<Hallway>> findAll();
}
