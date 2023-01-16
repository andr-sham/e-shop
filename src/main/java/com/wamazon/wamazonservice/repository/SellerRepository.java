package com.wamazon.wamazonservice.repository;


import com.wamazon.wamazonservice.dto.Seller;
import org.springframework.stereotype.Component;

@Component
public class SellerRepository extends UserRepository<Seller> implements ISellerRepository{

@Override
    public Seller findSellerByOrganization(String organizationName) {
        for (Seller seller : database) {
            if (seller.getOrganizationName().equalsIgnoreCase(organizationName)) {
                return seller;
            }
        }
        return null;
    }
}
