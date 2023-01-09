package web.model;


public class Car {
    String model;
    int series;
    String number;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Car(String model, int series, String number) {
        this.model = model;
        this.series = series;
        this.number = number;
    }

    public Car() {
    }
}
