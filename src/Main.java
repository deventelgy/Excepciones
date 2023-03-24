import javax.annotation.processing.Messager;

public class Main {
    public static void main(String[] args)
    {
        int a =12;
        int b= 2;

        try{
            int result = a/(b-2);
            System.out.println("Resultado = "+result);
        }catch (Exception ex){
            System.out.println("Error!."+ ex.getMessage());
        }
    }
}