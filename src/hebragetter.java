public class hebragetter implements Runnable{
    private VariableCompartida variable;
    public hebragetter(VariableCompartida variable) {this.variable=variable;}

    public VariableCompartida getVariable() {
        return variable;
    }

    @Override
    public void run(){
        System.out.println("get : "+ variable.obtener());
    }
}
