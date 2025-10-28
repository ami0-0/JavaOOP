public class WalkStrategy implements MoveStrategy{
    @Override
    public void move(int pointA, int pointB){
        System.out.println("Walking from " + pointA + " to " + pointB);
    }
}
