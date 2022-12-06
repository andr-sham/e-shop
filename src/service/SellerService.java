package service;

import dto.Seller;
import repository.IUserRepository;

public class SellerService extends UserService<Seller>{

    private IUserRepository userRepository; //todo raw

    public SellerService(IUserRepository userRepository) {  //todo raw
        this.userRepository = userRepository;
    }

    @Override
    public IUserRepository<Seller> getRepository() {
        return userRepository;
    }
}
