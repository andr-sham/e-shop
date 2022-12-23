package com.wamazon.wamazonservice.repository;



import com.wamazon.wamazonservice.dto.Seller;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SellerRepository extends UserRepository<Seller> {




    public Seller findSellerByOrganization(String organizationName) {
        for (Seller user : database) {
            if (user.getOrganizationName().equalsIgnoreCase(organizationName)) {
                return user;
            }
        }
        return null;
    }
}
