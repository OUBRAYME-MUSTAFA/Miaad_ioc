package dao;

public class Doaimpl implements IDao{
    @Override
    public double getData() {
        return Math.random()*40;

    }
}
