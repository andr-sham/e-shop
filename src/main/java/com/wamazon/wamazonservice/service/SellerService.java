package com.wamazon.wamazonservice.service;


import com.wamazon.wamazonservice.dto.RegistrationDto;
import com.wamazon.wamazonservice.dto.Seller;
import com.wamazon.wamazonservice.dto.UserDetails;
import com.wamazon.wamazonservice.repository.ICrudRepository;
import com.wamazon.wamazonservice.repository.ISellerRepository;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService extends UserService<Seller> implements ISellerService{
@Autowired
private ISellerRepository sellerRepository;
@Autowired
private UserDetailsContextService userDetailsContextService;

    @Override
    public boolean register(RegistrationDto registrationDto) {
        Seller seller = new Seller();
        seller.setLogin(registrationDto.getLogin());
        seller.setPassword(registrationDto.getPassword());

        sellerRepository.save(seller);

        UserDetails userDetails = new UserDetails();
        userDetails.setLogin(registrationDto.getLogin());
        userDetailsContextService.setUserDetails(userDetails);
        return true;
    }

    @Override
    public Seller login(String login, String password) {
        return null;
    }

    @Override
    public ICrudRepository<Seller> getRepository() {
        return sellerRepository;
    }

    @Override
    protected void validate(Seller dto) {

    }

    @Override
    public Seller findSellerByOrganization(String organizationName) {
        return sellerRepository.findSellerByOrganization(organizationName);
    }
}
