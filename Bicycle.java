class Bicycle{
  
    private String name;
    private String color;
    private int distance = 0;
    
    // �R���X�g���N�^
    Bicycle( String name,String color){
      this.name=name;
      this.color= color;
    }
    
    // name�̃Q�b�^�[
    public String getName(){
      return this.name;
    }
    // color�̃Q�b�^�[
    public String getColor(){
        return this.color;
    }
    
    // �C���X�^���X���\�b�h public �߂�l�̌^ ���\�b�h��() { }
    public void printData(){
        System.out.println("���O�F" + this.name );
        System.out.println("�F�F" + this.color );
        System.out.println("���s�����F" + this.distance + "km");
  }
  // �C���X�^���X���b�h run
    public void run(int distance){
      System.out.println(distance + "km����܂�");
      this.distance += distance;
      System.out.println("���s�����@�F" + this.distance + "km����܂���");
    }
    
    
  }