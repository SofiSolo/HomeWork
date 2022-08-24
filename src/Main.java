public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);


       dog = dog - 3.5;
       System.out.println(dog);

      cat = cat -1.6;
      System.out.println(cat);

      paper = paper -7639;
      System.out.println(paper);


      var friend = 19;
        System.out.println(friend);
       friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = 3.5 * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog= frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        System.out.println("вес боксёра 1 " + boxerOne + " кг");
        var boxerTwo = 82.7;
        System.out.println("вес боксёра 2  " + boxerTwo + " кг");
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес боксёров " + totalWeight + " кг !");
        var weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе боксёров " + weightDifference + " кг !");

        var weightOne = 78.2;
        System.out.println("Вес первого спортсмена " + weightOne + " кг");
        var weightTwo = 82.7;
        System.out.println("Вес второго спортсмена "+ weightTwo + " кг");
        var differenceWeight = (weightTwo - weightOne);
        System.out.println("разница в весе спортсменов " + differenceWeight+ " кг!");
        var weightChange = (weightTwo - weightOne)% totalWeight ;
        System.out.println("вес второго боьше на " + weightChange + " кг");


         var totalHours = 640;
         System.out.println(" Всего рабочих часов "+ totalHours);
         var timeIndividual = 8;
         System.out.println("Каждый сотрудник работает по " + timeIndividual + " часов");
         var staff = totalHours / timeIndividual;
         System.out.println("Всего в компании "+ staff + " человек работают по 8 часов");
         var newStaff = staff + 94;
         System.out.println("количество после увеличения колличества сотрудников " + newStaff+" человек" );
         var workinfHours = totalHours/newStaff;
         System.out.println("количество индивидуального часов после увеличения штата  " + workinfHours);
















        System.out.println("Home Work 3!");
    }
}