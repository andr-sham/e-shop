package com.wamazon.wamazonservice.repository;

import com.wamazon.wamazonservice.dto.Seller;

public interface ISellerRepository extends IUserRepository<Seller>{
    Seller findSellerByOrganization(String organizationName);
}
