package ServiceImpl;

import DTO.HallwayDto;
import Entities.Hallway;
import RepositoryImpl.HallwayDaoImpl;
import Service.HallwayService;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import static Utilities.Map.map;

public class HallwayServiceImpl implements HallwayService {

    @Override
    public Supplier<List<HallwayDto>> getAll() {
        HallwayDaoImpl dao = new HallwayDaoImpl();
        Function<Hallway, HallwayDto> f = hallway -> new HallwayDto(hallway.getName());
        Supplier<List<HallwayDto>> supplier = () -> map(dao.findAll().get(), f);
        return supplier;
    }
}
