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

class practice6 {
  public static void main(String[] args) {
   double hei = Math.sqrt(57);
   System.out.println("平方根" + hei);
   int zett = Math.abs(-45);
   System.out.println("絶対値" + zett);
   double cos = Math.cos(Math.toRadians(75));
   System.out.println(cos);
   int max = Math.max(Math.max(4, 5), 8);
   System.out.println(max);
   Scanner scan = new Scanner(System.in);
   double value = scan.nextDouble();
   System.out.println(Math.sqrt(value));
  }
}

class practice7 {
  public static void main(String[] args) {
    String name = "Miraboreasu";
    System.out.println(name.length());
    System.out.println(name.charAt(6));
    System.out.println(name.equals("Miraboreasu"));
  }
}

class practice8 {
  public static void main(String[] args) {
    int[] number = {5, 12, 8, 21, 9};
    int total = 0;
    for(int n : number) {
      total += n;
    }
    System.out.println("合計" + total);
    System.out.println("平均" + total/number.length);
    double[] data = {0.3, 1.05, 2.2};
    double tt = 0;
    for(double n : data) {
      tt += n;
    }
    System.out.println("合計" + tt);
    System.out.println("平均" + tt/data.length);
  }
}

class method {
  public static void main(String[] args) {
    System.out.println("Start");
    message("Welcome");
    System.out.println("End");
    double ans = calc(10.5, 2.35);
    System.out.println(ans);
    Scanner scan = new Scanner(System.in);
    double weight = scan.nextDouble();
    double height = scan.nextDouble();
    double value = bmi(weight, height);
    System.out.printf("BMI指数=%.2f", value);
    double ans1 = menseki(5.5);
    double ans2 = menseki(12, 2.5);
    System.out.printf("円の面積 = %.2f%n", ans1);
    System.out.printf("四角形の面積 = %.2f", ans2);
    double aw  = Util.menseki(5.5);
    System.out.printf("円の面積 = %.2f%n", aw);
    int num = sum(10, 20, 30, 40, 50);
    System.out.println(num);
  }
  public static void message(String msg) {
    System.out.println(msg);
  }
  public static double calc(double x1, double x2) {
    return Math.sqrt(x1 + x2);
  }
  public static double menseki(double hankei) {
    double s = Math.pow(hankei, 2) * Math.PI;
    return s;
  }
  public static double menseki(double height, double width) {
    double s = height * width;
    return s;
  }
  // practice
  public static double bmi(double weight, double height) {
    double index = weight / Math.pow((height / 100), 2);
    return index;
  }
  public static int sum(int... numbers) {
    int total = 0;
    for(int n : numbers) {
      total += n;
    }
    return total;
  }
}
/**
 * ユーティリティクラス
 * <p>
 * 便利なメソッドを集めたクラスです。<br>
 * これからも追加予定
 *
 * @version 1.0
 * @author Aさん
 */
class Util {
  /**
   * 四角形の面積を計算
   *
   * @param height 高さ
   * @param width　幅
   * @return 　　　四角形の面積
   */
  public static double menseki(double height, double width) {
    double s = height * width;
    return s;
  }
  /**
   * 円の面積を計算する
   *
   * @param hankei 円の半径
   * @return       円の面積
   */
  public static double menseki(double hankei) {
    double s = Math.pow(hankei, 2) * Math.PI;
    return s;
  }
}

class kankei {
  public static void main(String[] args) {
    int a = 3;
    System.out.println(a > 1);
  }
}

class zyouken {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = n * 1000;
    if(n>=5) {
      k *= 0.7;
    }
    System.out.printf("%,d円", k);
    int y = scan.nextInt();
    if(y%4==0 && y%100!=0 || y%400==0) {
      System.out.println("うるう年です");
    }else {
      System.out.println("うるう年ではありません");
    }
    int m = scan.nextInt();
    if(m==12 || m>=1 && m<=2) {
      System.out.println("冬");
    }else if(m>=3 && m<=5) {
      System.out.println("春");
    }else if(m>=6 && m<=8) {
      System.out.println("夏");
    }else if(m>=9 && m<=11) {
      System.out.println("秋");
    }else if(m==0) {
      System.out.println("月の値が不正です");
    }
  }
}