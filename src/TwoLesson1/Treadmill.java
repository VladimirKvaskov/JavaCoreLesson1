package TwoLesson1;

public class Treadmill implements DoObstacles {
    private int distLong;
    public Treadmill (int distLong) {
        this.distLong = distLong;
    }

    @Override
    // Если длинна дорожки не больше или равна длинне переменной (далее этой переменной присваивается длинна из массива препядствий) то правда
    public boolean run(int maxLong) {

        return (maxLong >= distLong);
    }

    @Override
    // Метод вызванный из этого класса всегда лож
    public boolean jump(int maxHeight) {
        return false;
    }

    @Override
    // переопределенный метод из родительского класса Object вставляет в сообщение - длинну беговой дорожки, с которой происходят действия в данной итерации
    public String toString () {
        return "беговая дорожка длинной " + distLong + " км";
    }
}
