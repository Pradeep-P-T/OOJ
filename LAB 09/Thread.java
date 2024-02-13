class BMS extends Thread{
    public void run(){
        while(true){
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000);
            } catch(InterruptedException e) {
                System.out.println("Interruted "+e);
            }
        }
    }
}
class CS extends Thread{
    public void run(){
        while(true){
            System.out.println("CSE");
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                System.out.println("Interruted "+e);
            }
        }
    }
}

public class Main{
    public static void main(String args[]){
        BMS bms=new BMS();
        CS cs=new CS();
        bms.start();
        cs.start();
    }
}
