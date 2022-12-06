package service;

import dto.Buyer;
import repository.IUserRepository;


public class BuyerService extends UserService<Buyer>{

    private IUserRepository userRepository; //todo raw

    public BuyerService(IUserRepository userRepository) {  //todo raw
        this.userRepository = userRepository;
    }

    @Override
    public IUserRepository<Buyer> getRepository() {
        return userRepository;
    }
}
