// Task 1
public class Main {
    public static void main(String[] args) {
        double dog = 8;
        var cat =3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        //Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + "\n" + cat + "\n" + paper);

        //Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper -7639;

        //Task 4

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Task 5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10.0;
        System.out.println(frog);
        frog = frog / 4;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Task 6

        var weigthFirst = 78.2;
        var weigthSecond = 82.7;
        var generalWeigth = weigthSecond + weigthSecond;
        System.out.println("Общий вес бойцов " + generalWeigth);
        var differenceWeight = weigthSecond - weigthFirst;
        System.out.println(differenceWeight + " кг разница между бойцами");
        var otherWayCount = weigthSecond % weigthFirst;
        System.out.println(otherWayCount + " Разница через %");

        // Task 8

        var generalTime = 640;
        var employee = generalTime / 8;
        System.out.println("Всего работников в компании- " + employee);
        var employeePlus = (employee + 94);
        var totalTime = generalTime / employeePlus;
        System.out.println("Если в компании работает, " + employeePlus + " то всего " + totalTime + " часов работы может быть поделено между сотрудниками." );


    }
}

