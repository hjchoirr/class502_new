package home04;

abstract class Vehicle{
    private String name;
    abstract public String getName(String val);
    public String getName(){
        return "vehicle name:" + name;
    }
    public void setName(String val){
        name = val;
    }
}
