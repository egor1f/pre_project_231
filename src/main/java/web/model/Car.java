package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String carColor;
    private int carYearRelease;
    private String carName;

    public Car() {
    }

    public Car(String carColor, int carYearRelease, String carName) {
        this.carColor = carColor;
        this.carYearRelease = carYearRelease;
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarYearRelease() {
        return carYearRelease;
    }

    public void setCarYearRelease(int carYearRelease) {
        this.carYearRelease = carYearRelease;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
