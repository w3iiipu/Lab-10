public class Car {

    public String make = "";
    public String model = "";
    public int year = 0;
    public double price = 0.0;


    public Car(int number, String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;


    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String printInventory()
    {
        return String.format("%-10s %-10s %-6d $%10.2f ", make, model, year, price);
    }



}
