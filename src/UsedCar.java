
public class UsedCar extends Car {

    private  double mileage;
    private String condition;

    public UsedCar(int number, String make, String model, int year, double price, double mileage, String condition) {
        super(number, make, model, year, price);
        this.mileage = mileage;
        this.condition = condition;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    @Override
    public String printInventory()
    {
        return String.format("%-10s %-10s %-6d $%10.2f %10.2f  %-10s ", make, model, year, price, mileage, condition);
    }



}
