package TwoLesson1;

public class Wall implements DoObstacles {
    private  int height;
    public Wall (int height) {
        this.height = height;
    }

    @Override
    // Метод вызванный из этого класса всегда лож
    public boolean run(int maxLong) {
        return false;
    }

    @Override
    // Если длинна дорожки не больше или равна длинне переменной (далее этой переменной присваивается высота из массива препядствий) то правда
    public boolean jump(int maxHeight) {
        return (maxHeight >= height);
    }
    @Override
    // переопределенный метод из родительского класса Object вставляет в сообщение - высоту стены, с которой происходят действия в данной итерации
    public String toString () {
        return "стена высотой " + height + " сантиметров";
    }
}
