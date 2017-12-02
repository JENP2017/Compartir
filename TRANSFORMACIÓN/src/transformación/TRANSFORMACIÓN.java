
package transformación;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TRANSFORMACIÓN {
    int ent,sali;
    public TRANSFORMACIÓN(int en){
        ent = en;
    }
    void salida(int j){
        sali = j;
    }
    public String ingreso_binario(String as){
      String n = as ;
      String cm = "" ;
      Pattern p=Pattern.compile("[^a-zA-Z&&[^2-9]&&[^\\s]&&[^¿'?\\D*]]");
      Matcher q = p.matcher(n);
      while(q.find()){
          cm += q.group() + "";
      }
        System.out.println();
        System.out.println("NÚMERO ACEPTADO "+cm);
        System.out.println();
              return cm;
    }
    public String ingreso_hexadecimal(String hd){
      String n = hd;
      String cm="";
      Pattern p = Pattern.compile("[^a-zG-z&&[^'.,¿]]");
      Matcher q = p.matcher(n);
      while(q.find()){
          cm += q.group() + "";
      }
        System.out.println();
        System.out.println("NÚMERO ACEPTADO "+cm);
        System.out.println();
      return cm;
    }
    public String Ingreso_decimal(String dc){
      String n = dc ;
      String cm="";
      Pattern p = Pattern.compile("[0-9]");
      Matcher q = p.matcher(n);
      while(q.find()){
          cm += q.group() + "";
      }
        System.out.println();
        System.out.println("NÚMERO ACEPTADO "+cm);
        System.out.println();
        int g = Integer.parseInt(cm);
      return cm;
    }
    public String ingreso_octal(String oc){
      String n = oc ;
      String cm="";
      Pattern p = Pattern.compile("[^a-zA-Z&&[^8-9]&&[^\\s]&&[^¿'?\\D*]]");
      Matcher q = p.matcher(n);
      while(q.find()){
          cm += q.group() + "";
      }
        System.out.println();
        System.out.println("NÚMERO ACEPTADO "+cm);
        System.out.println();
      return cm;
    }
    public String Hex(String xs){
        String m=xs;
        String d[];
        int s=0;
        int aux[]=new int [m.length()+1];
        d=m.split("");
        for (int i = 1; i < m.length()+1; i++) {
            if(d[i].equals("1"))
                aux[i]=1;
            if(d[i].equals("2"))
                aux[i]=2;
            if(d[i].equals("3"))
                aux[i]=3;
            if(d[i].equals("4"))
                aux[i]=4;
            if(d[i].equals("5"))
                aux[i]=5;
            if(d[i].equals("6"))
                aux[i]=6;
            if(d[i].equals("7"))
                aux[i]=7;
            if(d[i].equals("8"))
                aux[i]=8;
            if(d[i].equals("9"))
                aux[i]=9;
            if (d[i].equals("A"))
                aux[i]=10;
            if (d[i].equals("B"))
                aux[i]=11;
            if (d[i].equals("C"))
                aux[i]=12;
            if (d[i].equals("D"))
                aux[i]=13;
            if (d[i].equals("E"))
                aux[i]=14;
            if (d[i].equals("F"))
                aux[i]=15;
        }
        String a[]=d;
        int h[]=new int [m.length()+1];
        int g=m.length()+1;
        int cont=0;
        for (int i = 1; i < m.length()+1; i++) {
            g--;
            h[i]=aux[g];
            h[i]=(int) (h[i]*(Math.pow(16, cont)));
            cont++;
            s+=h[i];
            }
        String ho=String.valueOf(s);
        return ho;
    }
    public String Oct(String xs){
        String m=xs;
        String od[];
        od=m.split("");
        String a[]=od;
        int aux[]=new int[a.length];
        int g=m.length()+1;
        int cont=0,suma=0;
        for (int i = 0; i < m.length(); i++) {
            g--;
            aux[i]=Integer.parseInt(a[g]);
            aux[i]=(int) (aux[i]*(Math.pow(8, cont)));
            cont++;
        }
        for (int i = 0; i < m.length(); i++) {
            suma+=aux[i];
        }
            String oh=String.valueOf(suma);
            return oh;
    }
    public String Bin(String bp){
        String b=bp;
        String bo[];
        bo=b.split("");
        String bb[]=bo;
        int g=bo.length;
        int s=0;
        int aux[]=new int [bo.length];
        for (int i = 1; i < bo.length; i++) {
            g--;
            aux[i]=Integer.parseInt(bb[g]);
            aux[i]=(int)(aux[i]*(Math.pow(2, (i-1))));
            s+=aux[i];
        }
        String bv=String.valueOf(s);
        return bv;
    }
    void  Binario(String m){
        int b1=Integer.parseInt(m);
        int a=b1;
        int b=0,i=0,p,c=0;
        System.out.print("EL NUMERO EN BINARIO ES ");
        {while(b1!=0){
                b = b1%2;            
                b1 = b1/2;
                i++;
               }
        }
        int aux[]=new int[i];
        while(a!=0){
                p = a%2;            
                a = a/2;
                aux[c]=p;
                c++;
       }
        int k=aux.length;
        for (int j = 0; j < c; j++) {
            k--;
            System.out.print(aux[k]);
        }
        System.out.println();
    }
    void Octal(String m){
        int n=Integer.parseInt(m);
        int oct=0,b,a=0;
        while(n!=0){
                b=n%8;            
                oct=(int)(oct+b*Math.pow(10,a));   
                a++;
                n= n/8;}               
                System.out.println("EL NUMERO EN OCTAL ES: "+oct);
    }
    void Decimal(String m){
        if(ent==2 && sali==1){
        Binario(Oct(m));
        }
        if(ent==1 && sali==2){
        Octal(Bin(m));
        }
        if(ent==1 && sali==4){
        Hexadeimal(Bin(m));
        }
        if(ent==1 && sali==3){
        System.out.println("EL NÚMERO EN DECIMAL ES "+Bin(m));
        }
        if(ent==2 && sali==3){
        System.out.println("EL NUMERO EN DECIMAL ES "+(Oct(m)));
        }
        if(ent==2 && sali==4){
        Hexadeimal(Oct(m));
        }
        if(ent==4 && sali==1){
        Binario(Hex(m));
        }
        if(ent==4 && sali==2){
            Octal(Hex(m));
        }
        if(ent==4 && sali==3){
            System.out.println("EL NUMERO EN DECIMAL ES "+(Hex(m)));
        }
    }
    void Hexadeimal(String m){
        double n=Integer.parseInt(m);
        String dig_hex;
        String hex = "";
        int i;
        dig_hex = "123456789ABCDEF";
        if (n==16) {
            System.out.println("EN HEXADECIMAL ES 10");
        }else{
        do {
        i = (int)(n%16);
        hex = dig_hex.substring(i-1,i).concat(hex);
        n = Math.floor(n/16);
            } while (n!=0);
            System.out.println("EN HEXADECIMAL ES " + hex);
	}
     }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String op="";
        int entrada,sal;
        do{
        System.out.println("================================");
        System.out.println("ELIJA QUE OPCION VA A INGRESAR");
        System.out.println("1. BINARIO");
        System.out.println("2. OCTAL");
        System.out.println("3. DECIMAL");
        System.out.println("4. HEXADECIMAL");
        System.out.println("================================");
        entrada = leer.nextInt();
        }while(entrada < 1 || entrada > 4);
            if(entrada==1)
                System.out.println("INGRESE NUMERO BINARIO");
            if(entrada==2)
                System.out.println("INGRESE NUMERO OCTAL");
            if(entrada==3)
                System.out.println("INGRESE NUMERO DECIMAL");
            if(entrada==4)
                System.out.println("INGRESE NUMERO HEXADECIMAL");
        String hh=leer.next();
        TRANSFORMACIÓN ok = new TRANSFORMACIÓN(entrada);
        if(entrada==1){
             op = ok.ingreso_binario(hh);
        }
        if(entrada==2){
             op = ok.ingreso_octal(hh);
        }
        if(entrada==3){
             op = ok.Ingreso_decimal(hh);
        }
        if(entrada==4){
             op = ok.ingreso_hexadecimal(hh);
        }
        do{
        System.out.println("==============================================");
        System.out.println("ELIJA LA OPCION A LA QUE SE VA A TRANSFORMAR");
        System.out.println("1. BINARIO");
        System.out.println("2. OCTAL");
        System.out.println("3. DECIMAL");
        System.out.println("4. HEXADECIMAL");
        System.out.println("==============================================");
        sal = leer.nextInt();
        }while(sal < 1 || sal > 4);
        ok.salida(sal);
        if(sal==1){
                if(entrada==1 && sal==1){
                    System.out.println("EL NUMERO EN BINARIO ES "+op);
                }
                if(entrada==4 && sal==1){
                    ok.Decimal(op);
                }
                if(entrada==2 && sal==1){
                    ok.Decimal(op);
                }
                if(entrada!=4 && sal!=1){
                ok.Binario(op);
                }
                if(entrada==3 && sal==1){
                    ok.Binario(op);
                }
        }
        if(sal==2){
                if(entrada==2 && sal==2){
                    System.out.println("EL NUMERO EN OCTAL ES "+op);
                }
                if(entrada==4 && sal==1){
                    ok.Decimal(op);
                }
                if(entrada==1 && sal==2){
                ok.Decimal(op);
                }
                if(entrada==4){
                    ok.Decimal(op);
                }
                if(entrada!=4 && sal!=2){
                    ok.Octal(op);
                }
                if(entrada==3 && sal==2){
                    ok.Octal(op);
                }
                }
        if(sal==3){
                if(entrada==3 && sal==3){
                    System.out.println("EL NUMERO EN DECIMAL ES "+op);
                }
                ok.Decimal(op);
                }
        if(sal==4){
                if(entrada==4 && sal==4){
                    System.out.println("EL NUMERO EN HEXADECIMAL ES "+op);
                }
                if(entrada==2){
                    ok.Decimal(op);
                }
                if(entrada==1){
                    ok.Decimal(op);
                }else
                if(entrada==1){    
                ok.Hexadeimal(op);
                }
                if(entrada==3){
                    ok.Hexadeimal(op);
                }
            }
        }
    }