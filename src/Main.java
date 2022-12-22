import dto.Buyer;
import dto.Good;
import repository.CrudRepository;
import service.BuyerService;
import service.GoodService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Good>goods = new ArrayList<>();
        CrudRepository crudRepository= new CrudRepository(goods);
        GoodService goodService =new GoodService(crudRepository);

        Good good = new Good();
        good.setId(1L);
        good.setName("Book");

        goodService.save(good);

            goodService.get(111L);


        System.out.println("продолжение");

    }
}
