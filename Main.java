import java.util.Scanner;


class Main {
    public static void main(String[] args) {
      Bicycle bicycle = new Bicycle("ビアンキ","みどり");
      System.out.println("【自転車の情報】");
    //   System.out.println("名前：" + bicycle.getName() );
      bicycle.printData();
      System.out.println("-----------------------");
      Scanner scanner = new Scanner(System.in);
      System.out.print("走行距離を入力してください：");
      int runDistance = scanner.nextInt();
      bicycle.run(runDistance);

      System.out.println("=====================");
      Car car = new Car("フェラーリ","赤");
      car.printData();
      System.out.print("これから何km走りますか？");
      int carRunDistance = scanner.nextInt();
      car.run(carRunDistance);

      System.out.println("--------------------");
      System.out.print("何L給油しますか？：");
      int chargeAmount = scanner.nextInt();
      car.charge(chargeAmount);

    }
  }