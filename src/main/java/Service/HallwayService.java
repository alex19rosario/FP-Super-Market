package Service;

import DTO.HallwayDto;

import java.util.List;
import java.util.function.Supplier;

public interface HallwayService {

    public Supplier<List<HallwayDto>> getAll();
}
