class Bicycle{
  
    private String name;
    private String color;
    private int distance = 0;
    
    // コンストラクタ
    Bicycle( String name,String color){
      this.name=name;
      this.color= color;
    }
    
    // nameのゲッター
    public String getName(){
      return this.name;
    }
    // colorのゲッター
    public String getColor(){
        return this.color;
    }
    
    // インスタンスメソッド public 戻り値の型 メソッド名() { }
    public void printData(){
        System.out.println("名前：" + this.name );
        System.out.println("色：" + this.color );
        System.out.println("走行距離：" + this.distance + "km");
  }
  // インスタンスメッド run
    public void run(int distance){
      System.out.println(distance + "km走ります");
      this.distance += distance;
      System.out.println("走行距離　：" + this.distance + "km走りました");
    }
    
    
  }