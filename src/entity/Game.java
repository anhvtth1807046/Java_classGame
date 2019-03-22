package entity;

public class Game
{
    private String name;
    private String decription;
    private String price;
    private String dateOfIssue;
    private String homePage;

    public Game() {
    }

    public Game(String name, String decription, String price, String dateOfIssue, String homePage) {
        this.name = name;
        this.decription = decription;
        this.price = price;
        this.dateOfIssue = dateOfIssue;
        this.homePage = homePage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", decription='" + decription + '\'' +
                ", price='" + price + '\'' +
                ", dateofissue='" + dateOfIssue + '\'' +
                ", homePage='" + homePage + '\'' +
                '}';
    }
}
