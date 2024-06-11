package home04;

class Car extends Vehicle{
    public Car(String val){
        setName(val);
    }
    public String getName(String val){
        return "Car name : " + val;
    }
    public String getName(byte val[]){
        return "Car name : " + val;
    }
}