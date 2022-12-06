package repository;


import dto.Buyer;

import java.util.ArrayList;
import java.util.List;

public class BuyerRepository implements IUserRepository<Buyer> {


    private List<Buyer> database = new ArrayList<>();


    @Override
    public Buyer getUserByLogin(String login) {
        for (Buyer buyer : database) {
            if (buyer.getLogin().equalsIgnoreCase(login)) {
                return buyer;
            }
        }

        return null;
    }

    @Override
    public Buyer saveUsers(String login, String password) {
        Buyer buyer = new Buyer();
        buyer.setId(database.size() + 1);
        buyer.setLogin(login);
        buyer.setPassword(password);

        database.add(buyer);

        return buyer;
    }

    @Override
    public Buyer updateUser(Buyer buyerToUpdate) {

        database.remove(buyerToUpdate);

        database.add(buyerToUpdate);  // todo этого нет

        return buyerToUpdate;
    }
}
