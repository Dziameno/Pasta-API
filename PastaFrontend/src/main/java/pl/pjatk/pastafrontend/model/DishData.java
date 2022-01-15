package pl.pjatk.pastafrontend.model;

public class DishData {
    private long id;
    private String name;
    private String iname;
    private String amount;
    private String time;
    private String rating;
    private String preparation;

    public String getRating() {
        return rating;
    }

    public String getTime() {
        return time;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIname() {
        return iname;
    }

    public String getAmount() {
        return amount;
    }

    public String getPreparation() {
        return preparation;
    }

}
