class Kucing extends Hewan {
    
    public Kucing(String nama, int umur) {
        super(nama, umur);
    }

    // Overriding metode suara
    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: Meow!");
    }
}
