package relógio;
import java.util.Scanner;

public class Relógio
{
    int segundo;
    int minuto;
    int hora;
    int centésimo;
    int i;

    public static void main(String[] args) 
    {
        Scanner ler=new Scanner(System.in);
        Relógio x=new Relógio();
        
        System.out.println("Digite a hora do Relógio");
        x.hora = ler.nextInt();
        System.out.println("Digite os minutos do Relógio");
        x.minuto = ler.nextInt();
        System.out.println("Digite os segundos do Relógio");
        x.segundo = ler.nextInt();
        
        while(x.segundo!=-1 && x.minuto!=-1 && x.hora!=-1)
        {
            x.centésimo=x.centésimo+1;
            
            if(x.centésimo==17)
            {
                x.centésimo=0;
                x.segundo=x.segundo+1;
            }
            
            if(x.segundo>59)
            {
                x.segundo=0;
                x.minuto=x.minuto+1;
            }
            
            if(x.minuto>59)
            {
                x.minuto=0;
                x.hora=x.hora+1;
            }
            
            if(x.hora>23)
            {
                x.hora=0;
                x.minuto=0;
                x.segundo=0;
                x.segundo=x.segundo+1;
            }
            
            x.i=1;
            while (x.i>0)
            {
                System.out.printf("%02d:%02d:%02d",x.hora,x.minuto,x.segundo);
                x.i=x.i+1;
                
                System.out.println("");
                       
            }

        }
          
    }
}
