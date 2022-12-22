package dto;

import java.util.List;

public class Order extends LongIdDto  {



    private List<Good> goods;


    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }
}
