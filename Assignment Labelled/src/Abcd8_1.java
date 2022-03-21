public class Abcd8_1 implements  Runnable{
    
    public static void main(String[] args) {
          Storage store = new Storage();
          Printer p1 = new Printer(store);
          Abcd8_1 c1 = new Abcd8_1(store);
    }
    Storage st;
    public Abcd8_1(Storage store){
          st = store;
          new Thread(this, "Counter").start();
           
    }
    @Override
    public void run() {
          for(int i = 0 ; i < 10; i++){
      synchronized (st) {
                st.setValue(i);
                st.notify();
                try {
                  st.wait();
                }catch(InterruptedException ie) { System.err.println("Interrupted - " + ie.getMessage()); }
      }
          }
           
    }

}
class Printer implements Runnable{
    Storage st;
    public Printer(Storage st){
          this.st = st;
          new Thread(this, "Printer").start();
    }
    @Override
    public void run() {
        int counter = 0;
        synchronized (st) {
          while (counter < 9) {
          try {
            st.wait();
          }
          catch(InterruptedException ie) { System.err.println("Interrupted - " + ie.getMessage()); }
          System.out.println(Thread.currentThread().getName() + " " + (counter=st.getValue()));
          st.notify();
          }
        }
    }
     
}
class Storage{

    int  i;
    public synchronized void setValue(int i){   //note these method names do not follow 
          this.i = i;                           //javabean naming standard
    }
    public synchronized int getValue(){
          return this.i;
    }
}