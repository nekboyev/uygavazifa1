public class Country {
    private String name;
    private   String [] viloyatlar;
    private int index=0;

    public Country() {
        this.viloyatlar = new String[12];
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getViloyatlar() {
        return viloyatlar;
    }

    public void setViloyatlar(String [] viloyatlar) {
        this.viloyatlar = viloyatlar;
    }
}
