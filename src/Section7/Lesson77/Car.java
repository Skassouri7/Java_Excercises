package Section7.Lesson77;

public class Car {

    private String _make;
    private String _model;
    private String _color;

    private int _doors;

    private boolean _convertible;

    public String getMake(){
        return _make;
    }

    public String getModel() {
        return _model;
    }

    public String getColor() {
        return _color;
    }

    public int getDoors() {
        return _doors;
    }

    public void setMake(String make){
        _make = make;
    }

    public void setModel(String model) {
        _model = model;
    }

    public void setColor(String color) {
        _color = color;
    }

    public void setDoors(int doors) {
        _doors = doors;
    }

    public void setConvertible(boolean convertible) {
        _convertible = convertible;
    }

    public void describeCar(){
        System.out.println(_doors + "-Doors " +
                _color + " " +
                _make + " " +
                _model + " " +
                (_convertible ? "Convertible" : " " ));
    }
}
