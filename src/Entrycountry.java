import java.util.Scanner;

public class Entrycountry {
 private static   Country [] country=new Country[100];
   Country country1=new Country();
   private static int a1=0 ;

    public static Country[] getCountry() {
        return country;
    }

    public static void setCountry(Country[] country) {
        Entrycountry.country = country;
    }

    public static int getA1() {
        return a1;
    }



    public void show1() {
        System.out.println("1.Entry country name");
        System.out.println("2.Show countries names");
        System.out.println("3.Entry region in country ");
    }

    public void opinoins() {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        switch (a) {
            case 1: {
                gettingcountryname();

            break;}
            case 2: {
                showcountry();
            }
            break;
            case 3: {
                entryregions entryregions=new entryregions();
                showcountry();
                System.out.println("viloyat qo'shmoqchi bo'lgan davlatingizni raqamini kiriting :");
                int y=n.nextInt();
                while(y<0||y>a1+1){
                    System.out.println("siz mavjud bo'lmagan davlat raqamini kiritdinggiz iltimos qaytib urinib ko;ring :");
                }
                entryregions.setCountrnumber(y);
                entryregions.showregionmenu();
                entryregions.opinion();

            }
            default: {
                defaultres(a);
            }
        }
    }

    public void defaultres(int a) {
        Scanner n = new Scanner(System.in);
        while (a < 1 || a > 3) {
            System.out.println("siz mavjud bo'lmagan buyruqni kiritdingiz!");
            System.out.println("qaytib urinib ko'ring");
            a = n.nextInt();
        }
        switch (a) {
            case 1: {
                gettingcountryname();
                break;
            }

            case 2: {
                showcountry();
            }
            break;

        }
    }

    public void gettingcountryname() {
        Scanner n = new Scanner(System.in);
        System.out.println("mamlakat nomini kiriting :");
        String name= n.nextLine();
country[a1]=new Country();
        country[a1].setName(name);
        ++a1;
    }

    public void showcountry() {
        for (int i = 0; i < a1; ++i) {
            System.out.println((i+1)+":"+country[i].getName());
        }
    }
}

