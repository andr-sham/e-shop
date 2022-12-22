package repository;

import dto.Seller;


import java.util.ArrayList;
import java.util.List;

public class SellerRepository implements IUserRepository<Seller> {


    private List<Seller> database = new ArrayList<>();


    @Override
    public Seller getUserByLogin(String login) {
        for (Seller seller : database) {
            if (seller.getLogin().equalsIgnoreCase(login)) {
                return seller;
            }
        }

        return null;
    }

    @Override
    public Seller saveUsers(String login, String password) {
        Seller seller = new Seller();
        seller.setId(database.size() + 1);
        seller.setLogin(login);
        seller.setPassword(password);

        database.add(seller);

        return seller;
    }

    @Override
    public Seller updateUser(Seller sellerToUpdate) {

        database.remove(sellerToUpdate);

        database.add(sellerToUpdate);

        return sellerToUpdate;
    }
}
