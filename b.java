public class b implements Runnable{
  public static void main(String []args){
    Thread t1=new Thread(){
      public void run(){
        System.out.println("Hello");
      }
    };
    
    t1.start();
  }
}
