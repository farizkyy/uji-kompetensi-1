class anjing extends Hewan {
    
    public anjing(String nama, int umur) {
        super(nama, umur);
    }

    // Overriding metode suara
    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: guk!");
    }
}
