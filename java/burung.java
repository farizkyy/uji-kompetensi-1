class Burung extends Hewan {
    
    public Burung(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: Tweet!");
    }
}
