import java.util.Scanner;

public class entryregions extends Entrycountry {
   //private String [] regions=new String[100];
   Entrycountry mw=new Entrycountry();



    private   int countrnumber;
    private  int w=getCountry()[countrnumber].getIndex();

    public int getCountrnumber() {
        return countrnumber;
    }

    public void setCountrnumber(int countrnumber) {
        this.countrnumber = countrnumber;
    }

    public  void showregionmenu(){
        System.out.println("1.viloyat kiritish :");
        System.out.println("2.viloyatni o'chirish :");
        System.out.println("3.viloyatlar nomni ko'rish :");
    }
    public void opinion(){
        Scanner n = new Scanner(System.in);
        int a=n.nextInt();
        switch (a){
            case 1:{
                vil(n);
                break;
            }
            case 2:{
                showingregion();
              deletingregions();
              break;
            }
            case 3 :{
                showingregion();
                break;
            }
        }
    }

    private void vil(Scanner n) {
        Scanner scanner1=new Scanner(System.in);
      // System.out.println(getCountry()[countrnumber-1].getName());
        System.out.println("viloyat nomini kiriting :");
        // getCountry()[countrnumber - 1].setViloyatlar();

        getCountry()[countrnumber-1].getViloyatlar()[w]=scanner1.nextLine();

        getCountry()[countrnumber-1].setIndex(++w);

    }

    public void showingregion(){
        int u=0;
        for(int i=0;i<w;++i){
          System.out.println((u+1)+":"+ getCountry()[countrnumber-1].getViloyatlar()[i]);
            ++u;
        }
    }
    public void deletingregions(){
        Scanner n = new Scanner(System.in);
        System.out.println("o'chirmoqchi bo'lgan viloyatingizni nomini kiriting :");
        int b=n.nextInt();
        while(b<0||b>getA1()+1){
            System.out.println("siz mavjud bo'magan viloyat raqamini kiritdingiz");
            System.out.println("qaytib kiriting");
            b=n.nextInt();
        }
       getCountry()[countrnumber-1].getViloyatlar()[w]="";
        getCountry()[countrnumber-1].setIndex(--w);
        showingregion();
    }
}

