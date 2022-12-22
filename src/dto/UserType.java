package dto;

public enum UserType {

    SUPPORT(10),
    ADMINISTRATOR(9),
    SELLER(5),
    SELLER_MANAGER(3),
    CLIENT(1);

    private int level;



    UserType(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
