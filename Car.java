class Car{
  
    private String name;
    private String color;
    private int distance = 0;
    private int fuel = 100;
    
    // �R���X�g���N�^
    Car( String name,String color){
      this.name = name;
      this.color = color;
    }
    
    // �C���X�^���X���\�b�h public �߂�l�̌^ ���\�b�h��() { }
    public void printData(){
      System.out.println("���O�F" + this.name );
      System.out.println("�F�F" + this.color );
      System.out.println("���s�����F" + this.distance + "km");
      System.out.println("�K�\�����ʁF"+ this.fuel + "L");
    }
  
  // �C���X�^���X���\�b�hrun
  public void run( int distance){
     System.out.println( distance + "km����܂�");
     if(distance <= fuel){
        this.distance += distance;
        this.fuel -= distance;
     }else{
         System.out.println("�K�\�������s�����Ă��܂�");
     }

     System.out.println("���s����:" + this.distance + "km");
     System.out.println("�K�\�����ʁF" + this.fuel + "L");
  }
  
//   ��b��X�^���X���\�b�hcharge����
  public void charge(int chargeAmount){
      if(chargeAmount <= 0){
        System.out.println("�����ł��܂���");
      }else if(chargeAmount+this.fuel >= 100 ){
        System.out.println("���^���܂ŋ������܂�");
        this.fuel = 100;

      }else{
          this.fuel += chargeAmount;
          

      }
      System.out.println("�K�\�����ʁF" + this.fuel + "L");

  }
  
    
  }