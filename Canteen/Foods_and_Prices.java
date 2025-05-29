package Canteen;

public class Foods_and_Prices extends Main {
    int turon;
    int bananaQ;
    int dutchmill;
    int chuckie;
    int oreo;
    int skyflakes;
    int hotdog;   
    int cheesesticks;
    int breadroll;

    void turon() {
        turon = 5;
        System.out.println("Turon: " + turon);
    }
    void bananaQ() {
        bananaQ = 10;
        System.out.println("Banana Q: " + bananaQ);
    }
    void dutchmill() {
        dutchmill = 35;
        System.out.println("Dutchmill: " + dutchmill);
    }
    void chuckie() {
        chuckie = 35;
        System.out.println("Chuckie: " + chuckie);
    }
    void oreo() {
        oreo = 10;
        System.out.println("Oreo: " + oreo);
    }
    void skyflakes() {
        skyflakes = 10;
        System.out.println("Skyflakes: " + skyflakes);
    }
    void hotdog() {
        hotdog = 25;
        System.out.println("Hotdog: " + hotdog);
    }
    void cheesesticks() {
        cheesesticks = 5;
        System.out.println("Cheesesticks: " + cheesesticks);
    }
    void breadroll() {
        breadroll = 10;
        System.out.println("Breadroll: " + breadroll);
    }

    int getPrice(int itemNumber) {
        switch (itemNumber) {
            case 1: return turon;
            case 2: return bananaQ;
            case 3: return dutchmill;
            case 4: return chuckie;
            case 5: return oreo;
            case 6: return skyflakes;
            case 7: return hotdog;
            case 8: return cheesesticks;
            case 9: return breadroll;
            default: return 0; // Invalid item number
        }
    }
}
