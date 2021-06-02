public class ManagerCommand {
    private final CheckArea checkArea = new CheckArea();

    public void help() {
        System.out.println("Команды:\n" +
                "help - справка по командам\n" +
                "show - вывести все точки\n" +
                "insert - добавить новую точку\n" +
                "delete - удалить точку по id\n" +
                "clear - удалить все точки\n" +
                "exit - завершить раобту программы\n");
    }

    public void show() {
        int i = 1;
        System.out.println("id   x    y    r    hit         time       runtime");
        for (Point p: checkArea.getPoints()) {
            System.out.printf("%2d %4.1f %4.1f %4.1f %6b %2s %d\n",
                    i, p.getX(), p.getY(), p.getR(), p.getHit(), p.getTime(), p.getRuntime());
            i++;
        }
    }

    public void insert(double x, double y, double r) {
        checkArea.setX(x);
        checkArea.setY(y);
        checkArea.setR(r);
        checkArea.newPoint();
    }

    public void delete(int index) {
        checkArea.deletePoint(index);
    }

    public void clear() {
        checkArea.clearPoints();
    }
}
