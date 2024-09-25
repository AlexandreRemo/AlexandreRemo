public class Funcionario {                                          
    private String nome;
    private double salarioBase;  

    public Funcionario(String nome, double salarioBase){                                                
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
        return "Nome "+nome+ " Salário Base: "+salarioBase;
    }

}

public class Gerente {
    private String nome;
    private double salarioBase;
    private double bonus;

    public Gerente (String nome, double salarioBase, double bonus){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double setcalculaSalario(double salarioBase, double bonus){
        return salarioBase + bonus;
    }
    
    public String toString(){
        return "Nome "+nome+" Salário Base: "+setcalculaSalario(salarioBase, bonus)+ " Bônus de: "+bonus;
    }
}

public class Diretor {
    private String nome;
    private double salarioBase;
    private double bonus;
    private double auxilioMoradia;

    public Diretor (String nome, double salarioBase, double bonus, double auxilioMoradia){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
        this.auxilioMoradia = auxilioMoradia;
    }

    public double getAuxilioMoradia() {
        return auxilioMoradia;
    }

    public void setAuxilioMoradia(double auxilioMoradia) {
        this.auxilioMoradia = auxilioMoradia;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double setcalculaSalario(double salarioBase, double bonus){
        return salarioBase + bonus + auxilioMoradia;
    }
    
    public String toString(){
        return "Nome "+nome+" Salário Base: "+setcalculaSalario(salarioBase, bonus)+ " Bônus de: "+bonus+
        " Auxilio moradia: " +auxilioMoradia;
    }
}

  public class Main {
    public static void main (String[] Args){
        
        Funcionario f1 = new Funcionario("Alexandre", 3000);
        System.out.println(f1.toString());

        Gerente g1 = new Gerente("Juka", 5000, 200);
        System.out.println(g1.toString());

        Diretor d1 = new Diretor("Romario", 7000, 400, 100);
        System.out.println(d1.toString());
    }
}
