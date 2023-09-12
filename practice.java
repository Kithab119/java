import java.util.*;

public class practice {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("Hello World2");
    System.out.println(100 + 30);
    String greeting = "aho";
    System.out.println(greeting);
    Scanner scan = new Scanner(System.in);
    String message = scan.next();
    System.out.println("oh " + message);
    int number = scan.nextInt();
    System.out.println(number);
    if (number == 1) {
      System.out.println(number);
    }
  }
}

class practice2 {
  public static void main(String[] args) {
    System.out.println("Hello World");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    if (number == 100) {
      System.out.println(number);
    } else if (number < 100) {
      System.out.println("器が小さい");
    } else {
      System.out.println("カリスマ");
    }
    String word = scan.next();
    if (word.equals("yah")) {
      System.out.println(word);
    } else {
      System.out.println("tt");
    }
    String ai = "aiueo";
    for (int i = 0; i < 6; i++) {
      System.out.println(ai);
    }
  }
}

class practice3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    for (int i = 0; i <= count; i++) {
      System.out.println(i);
    }
    int number = scan.nextInt();
    if (number == 3) {
      System.out.println("Mr." + number);
    } else {
      System.out.println("バロックワークス");
    }
    double xyz = Math.random() * 61 + 20;
    int abc = (int)xyz;
    System.out.println("君は" + abc + "点");
  }
}

class practice4 {
  public static void main(String[] args) {
    int i = 0;
    while (i <= 3) {
      System.out.println("天才" + i);
      i = i + 1;
    }
  }
}

//ここまで、変数、Sccaner、if、for、while、randum

class practice5 {
  public static void main(String[] args) {
    String[] name = {"佐藤","青空","マスター"};
    System.out.println(name[0]);
    System.out.println(name[1]);
    Calendar calendar = Calendar.getInstance();
    int nenn = calendar.get(Calendar.YEAR);
    System.out.println(nenn);
  }
}

//学習チャート...progate => dotinstall(無料枠) => paiza演習B =>
//VSCode...Git準備
//SpringBoot...準備