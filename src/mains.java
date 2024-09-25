import java.util.Scanner;

public class mains {
  private   boolean u = false;

    Entrycountry m=new Entrycountry();

    public boolean getterU() {
        return u;
    }

    public void setU(boolean u) {
        this.u = u;
    }

    public  void show() {
        System.out.println("1.entry Country");
        System.out.println("2.delete Country");
        System.out.println("3.quit");
    }

    public  void opinoins(boolean u) {

        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        switch (a) {
            case 1: {
                m.show1();
                m.opinoins();
            }
            break;
            case 2: {
            }
            break;
            case 3: {
                u = true;
                break;
            }
            default:
            {
              defaultres(a);
            }
        }
    }
    public void defaultres(int a){
        Scanner n = new Scanner(System.in);
        while(a<1||a>3){
            System.out.println("siz mavjud bo'lmagan buyruqni kiritdingiz!");
            System.out.println("qaytib urinib ko'ring");
            a=n.nextInt();
        }
        switch (a) {
            case 1: {
                m.show1();
                m.opinoins();
            }
            break;
            case 2: {
                System.out.println("o'chirmoqchi bo'lgan davlatingiz nomini kiriting :");

            }
            break;
            case 3: {
                u = true;
                break;
            }
        }
    }
}
