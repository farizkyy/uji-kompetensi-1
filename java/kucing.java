class Kucing extends Hewan {
    
    public Kucing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: Meow!");
    }
}
