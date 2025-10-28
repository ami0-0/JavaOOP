public class HorseStrategy implements MoveStrategy{
    @Override
    public void move(int pointA, int pointB){
        System.out.println("Riding a horse from " + pointA + " to " + pointB);
    }
}
