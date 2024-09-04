import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String palavra;
        
        int conta = 0;
        
        System.out.println("Digite a palavra: ");
        Scanner scanner = new Scanner(System.in);
        palavra = scanner.nextLine();

        int tamanho = palavra.length();

        for(int i = 0; i < tamanho; i ++){
            if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A'){
                System.out.println(palavra.charAt(i));
                conta +=1;
            }
        }
        scanner.close();
        System.out.println(conta);
        
    }
}
