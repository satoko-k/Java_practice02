import java.util.Scanner;


class Main {
    public static void main(String[] args) {
      Bicycle bicycle = new Bicycle("�r�A���L","�݂ǂ�");
      System.out.println("�y���]�Ԃ̏��z");
    //   System.out.println("���O�F" + bicycle.getName() );
      bicycle.printData();
      System.out.println("-----------------------");
      Scanner scanner = new Scanner(System.in);
      System.out.print("���s��������͂��Ă��������F");
      int runDistance = scanner.nextInt();
      bicycle.run(runDistance);

      System.out.println("=====================");
      Car car = new Car("�t�F���[��","��");
      car.printData();
      System.out.print("���ꂩ�牽km����܂����H");
      int carRunDistance = scanner.nextInt();
      car.run(carRunDistance);

      System.out.println("--------------------");
      System.out.print("��L�������܂����H�F");
      int chargeAmount = scanner.nextInt();
      car.charge(chargeAmount);

    }
  }