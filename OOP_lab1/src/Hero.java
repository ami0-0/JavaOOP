public class Hero {
    private int pointA = 0;
    private MoveStrategy moveStrategy = new WalkStrategy();

    public void changeStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public void startMoving(int pointB) {
        moveStrategy.move(pointA, pointB);
        pointA = pointB;
    }

    public int getPointA() {
        return pointA;
    }
}