public class Carro{
    private String marca;
    private short ano;
    private float valor;

    private void price(int value){
      valor = (float) (value-(value*0.20));
      return;
    }

    public void preço(int value){
        price(value);
    }

    private void year(int year){
        ano = (short) year;
        return;
    }

    public void ano(int year){
        year(year);
        return;
    }

    private void brand(String name){
        marca = name;
        return;
    }

    public void marca(String name){
        brand(name);
        return;
    }

    private void values(){
        System.out.printf("\nValor do seu carro:\n%f%n", valor);
        System.out.printf("Ano do seu carro:\n%d%n", ano);
        System.out.printf("Marca do seu carro:\n%s%n", marca);
        return;
    }

    public void valores(){
        values();
    }
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.price(3000);
        carro.ano(1999);
        carro.marca("Renault");
        carro.valores();
    }
}
