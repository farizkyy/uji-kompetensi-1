class burung extends Hewan {
    
    public burung(String nama, int umur) {
        super(nama, umur);
    }

    // Overriding metode suara
    @Override
    public void suara() {
        System.out.println(getNama() + " berkata: berkicau!");
    }
}
