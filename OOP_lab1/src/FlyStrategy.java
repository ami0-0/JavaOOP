public class FlyStrategy implements MoveStrategy{
    @Override
    public void move(int pointA, int pointB){
        System.out.println("Flying from " + pointA + " to " + pointB);
    }
}
