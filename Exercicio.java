/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int i = 0;
        int a = 0;
        int num1;
        int num2;
        do {
        System.out.println("1 - Somar");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Faixa etária");
        i = scn.nextInt();
        
            switch(i){
            case 1:
                    System.out.println("Digite um número");
                    num1 = scn.nextInt();
                    System.out.println("Digite um número");
                    num2 = scn.nextInt();
                    int soma = num1 + num2;
                    System.out.println("Resultado: "  + soma);
                    do{
                        System.out.println("Voltar digite 0!");
                        a = scn.nextInt();
                    }while(a != 0);
                    //continue;
                    break;
                case 2: 
                    System.out.println("Digite um número");
                    num1 = scn.nextInt();
                    System.out.println("Digite um número");
                    num2 = scn.nextInt();
                    int subtracao = num1 - num2;
                    System.out.println("Resultado: " +subtracao);
                    do{
                        System.out.println("Voltar digite 0!");
                        a = scn.nextInt();
                    }while (a !=0);                   
                    break;
                case 3: 
                    System.out.println("Digite um número");
                    num1 = scn.nextInt();
                    System.out.println("Digite um número");
                    num2 = scn.nextInt();
                    if(num2 != 0){
                    int divisao = num1 / num2;
                    
                    System.out.println("Resultado: "+divisao);
                    }
                    else {
                        System.out.println("Nenhum numero é divisivel por 0");
                    }
                    do{
                        System.out.println("Para voltar digite 0!");
                        a = scn.nextInt();
                    }while (a !=0);
                    break;
                case 4:
                    System.out.println("Quantidade de Pessoas");
                    int p = scn.nextInt();
                    for (int b = 0; b < p; b++){
                        System.out.println("Digite Idade");
                        System.out.println("Digite Sexo");
                    }
                    
                    System.out.println("Digite sua idade");
                    System.out.println("Digite seu sexo");
                    break;
            }
        
            }while(i != 4);
    }
}
