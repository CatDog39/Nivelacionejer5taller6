
package ejer5taller6;
    import java.util.Scanner;


public class Ejer5taller6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea =new Scanner(System.in);
        String placa;
        Character tipo, rpta;
        int npt, c1 = 0, ap2 = 0, c2 = 0, c3 = 0, ct = 0 ;
        float vrp, adit = 0, adi4 = 0, dinero = 0, prom = 0, porc = 0;
        
        System.out.println("Desea ingresar registros? (S/N): ");
        rpta = lea.next().charAt(0);
        
        while (rpta.equals('S') || rpta.equals('s'))
        {
            System.out.print("Digite la placa: ");
            placa = lea.next();
            System.out.print("Digite el tipo de vehiculo (1=Colectivo, 2=Microbus, 3=Buseta, 4=Bus)");
            tipo= lea.next().charAt(0);
            System.out.print("Cantidad de pasajeros transportados: ");
            npt= lea.nextInt();
            System.out.print("Valor de pasaje: ");
            vrp= lea.nextFloat();
            
            dinero= npt * vrp;
            adit = adit + dinero;
            ct++;
            
            switch (tipo)
            {
                case 1: 
                {
                    if (npt > 100)
                    {
                        c1++;
                        break;
                    }
                }
                case 2:
                {
                    ap2 = ap2 + npt;
                    c2++;
                    break;
                }
                case 4:
                {
                    adi4 = adi4 + dinero;
                    break;
                }
                case 3: 
                {
                    c3++;
                    break;
                }
                default :
                {
                    System.out.println("TIPO DE VEHICULO NO VALIDO");
                }
            }//fin caso
            
            System.out.println("Desea ingresar otro registro? (S/N): ");
            rpta = lea.next().charAt(0);
        }//fin mientras
        
        if (c2 != 0)
            prom = ap2/c2;
        else
            prom = 0;
        
        if (ct != 0)    
            porc = c3 * 100 / ct;
        else
            porc = 0;
        
        System.out.print("Total ingreso de la empresa: $" + adit);
        System.out.print("Cuantos de los colectivos transportaron más de 100 pasajeros: " + c1);
        System.out.print("Promedio de pasajeros transportados por los microbuses: " + prom);
        System.out.print("Cuanto dinero recolectaron en total los buses: $" + adi4);
        System.out.print("Porcentaje de busetas respecto al total de los vehiculos: " + porc);
        
        
    }
    
}
