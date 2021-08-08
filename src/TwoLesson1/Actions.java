package TwoLesson1;

public class Actions {
    public static void main(String[] args) {
        HeightLong[] participants = {
                new Human("Олег", 13, 80),
                new Cat("Черный", 14, 100),
                new Robot("Альфа", 40, 30),
                new Human("Иван", 18, 110),
                new Cat("Черный", 8, 70),
                new Robot("Гамма", 6, 90),
        };
        DoObstacles[] obstacles = {
                new Treadmill(8),
                new Wall(40),
                new Treadmill(18),
                new Wall(100),
        };
        for (HeightLong participant : participants) {
            System.out.println("На полосу препядствий выходит " + participant);
            //булевая переменная для проверки условия успеха
            boolean Success = true;
            for (DoObstacles obstacle : obstacles) {
                System.out.println("перед ним " + obstacle);
                // в условии для препядстви вызывается метод run (obstacle.run)
                // который принимает в аргумент значение obstacle и в то же время использует в нутри метода аргумент
                // maxLong или maxHeight из participant - (participant.get......())
                // если условие верно то true и идет сообщение
                        if (obstacle.run(participant.getDodistance())
                        || obstacle.jump (participant.getDoheight())){
                        System.out.println(participant + " прошел препядствие");
                }
                        //если условие не выполнилось то false и идет второе сообщение
                else {
                    System.out.println(participant + " выбыл с дистанции");
                    Success = false;
                    break;
                }
            }
            //проверка прошел ли участник все препядствия если Success true то он справился иначе провалил испытание
            if (Success) {
                System.out.println(participant + " справился с полосой");
            }
            else {
                System.out.println(participant + " провалил испытание");
            }
        }
    }
}
