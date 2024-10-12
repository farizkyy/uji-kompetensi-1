class Anjing extends Hewan {
    
    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: Guk!");
    }
}
