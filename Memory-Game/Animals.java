public enum Animals {
    BEE      (0,"images/bee.jpg"),
    COW      (1,"images/cow.jpg"),
    EAGLE    (2,"images/eagle.jpg"),
    ELEPHANT (3,"images/elephant.jpg"),
    FISH     (4,"images/fish.jpg"),
    GOAT     (5,"images/goat2.jpg"),
    HORSE    (6,"images/horse.jpg"),
    LION     (7,"images/lion.jpg"),
    MONKEY   (8,"images/monkey.jpg"),
    OSTRICH  (9,"images/ostrich.jpg" ),
    PARROT   (10,"images/parrot.jpg"),
    PIG      (11,"images/pig.jpg"),
    RABBIT   (12,"images/rabbit.jpg"),
    ROOSTER  (13,"images/rooster.jpg"),
    SNAKE    (14,"images/snake.jpg"),
    ZEBRA    (15,"images/zebra.jpg");

    private String pic;
    private int index;
    Animals(int id, String address){
        index = id;
        pic = address;
    }

    public String getPic(){
        return pic;
    }

    public int getID(){
        return index;
    }

    public static Animals elementAt(int id){
        switch(id){
            case 0:
                return BEE;
            case 1:
                return COW;
            case 2:
                return EAGLE;
            case 3:
                return ELEPHANT;
            case 4:
                return FISH;
            case 5:
                return GOAT;
            case 6:
                return HORSE;
            case 7:
                return LION;
            case 8:
                return MONKEY;
            case 9:
                return OSTRICH;
            case 10:
                return PARROT;
            case 11:
                return PIG;
            case 12:
                return RABBIT;
            case 13:
                return ROOSTER;
            case 14:
                return SNAKE;
            case 15:
                return ZEBRA;
        }
        return null;
    }
}
