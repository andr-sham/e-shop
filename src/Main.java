import repository.BuyerRepository;
import repository.IUserRepository;
import repository.SellerRepository;

import service.BuyerService;
import service.IUserService;
import service.SellerService;


public class Main {

    public static void main(String[] args) {

        IUserRepository sellerRepository = new SellerRepository();
        IUserRepository buyerRepository = new BuyerRepository();


        IUserService sellerService = new SellerService(sellerRepository);
        IUserService buyerService = new BuyerService(buyerRepository);

        sellerService.register("seller123", "asd1234567");
        buyerService.register("buyer123", "asd1234567");


    }
}
