public class test {
    public static void main(String[] args) throws InterruptedException {
        VariableCompartida vc = new VariableCompartida();
        hebragetter h1 = new hebragetter(vc);
        hebraset h2 = new hebraset(vc);
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Han finalizado");
    }
}
