import com.sun.jdi.event.ClassUnloadEvent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco("Santander");

        Cliente lais = new Cliente("Lais", true);
        Cliente pedro = new Cliente("Pedro", true);
    }
}