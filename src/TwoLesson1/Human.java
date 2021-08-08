package TwoLesson1;

public class Human implements HeightLong{
    private String Name;
    private int Dodistance;
    private int Doheight;

    public Human(String Name, int Dodistance, int Doheight) {
        this.Name = Name;
        this.Dodistance = Dodistance;
        this.Doheight = Doheight;
    }
    @Override
    // метод берет значение дистанции для данного класса
    public int getDodistance() {
        return Dodistance;
    }

    @Override
    // метод берет значение высоты для данного класса
    public int getDoheight() {
        return Doheight;
    }
    @Override
    // переопределенный метод из родительского класса Object вставляет в сообщение - имя человека, с которой происходят действия в данной итерации
    public String toString (){
        return "участник " + Name;
    }
}
