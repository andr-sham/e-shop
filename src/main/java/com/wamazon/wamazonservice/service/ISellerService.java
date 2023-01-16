package com.wamazon.wamazonservice.service;

import com.wamazon.wamazonservice.dto.Seller;

public interface ISellerService extends IUserService<Seller>{
    Seller findSellerByOrganization(String organizationName);
}
