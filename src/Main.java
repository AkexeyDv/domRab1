public class Main {
    public static void main(String[] args)
    {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println("Список значений переменных:");
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        dog=dog+2;
        cat=cat+2;
        paper=paper+2;
        System.out.println("Список значений переменных:");
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println("Список значений переменных:");
        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        var friend=19;
        System.out.println("Приравняли "+friend);
        friend=friend*2;
        System.out.println("Умножили "+friend);
        friend=friend/19;
        System.out.println("Поделили "+friend);

        var frog=3.5;
        System.out.println("Приравняли "+frog);
        frog=frog*10;
        System.out.println("Умножили "+frog);
        frog=frog/3.5;
        System.out.println("Поделили "+frog);
        frog=frog+4;
        System.out.println("Добавили "+frog);

        var box1=78.2;
        var box2=82.7;
        var summBox=box1+box2;
        System.out.println(summBox);
        var deltaBox=box2-box1;
        System.out.println(deltaBox);

        var sport1=80;
        var sport2=77;
        var delta=sport1-sport2;
        System.out.println(delta);
        delta=sport1%sport2;
        System.out.println(delta);

        var time=640;
        var partTime=8;
        var collegi=time/partTime;
        System.out.println("Всего сотрудников в компании - "+collegi+" человек");
        collegi=collegi+94;
        time=partTime*collegi;
        System.out.println("Если в компании работает "+collegi+" человек, " +
                "то всего "+time+" часов работы может быть поделено между сотрудниками");




    }
}