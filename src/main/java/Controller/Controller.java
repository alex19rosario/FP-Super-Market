package Controller;

import ServiceImpl.HallwayServiceImpl;

public class Controller {

    public static void main(String[] args){

        //Show Hallways
        HallwayServiceImpl service = new HallwayServiceImpl();
        service.getAll().get().forEach(hallwayDto -> System.out.println(hallwayDto.getName()));
    }
}
