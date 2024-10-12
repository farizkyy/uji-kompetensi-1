public class main {
    
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kitty", 2);
        Anjing anjing = new Anjing("Buddy", 3);
        Burung burung = new Burung("Tweety", 1);

        kucing.suara();
        anjing.suara();
        burung.suara();

        kucing.setUmur(3);
        System.out.println(kucing.getNama() + " sekarang berumur " + kucing.getUmur() + " tahun.");
        
        Anjing anjing2 = new Anjing("Max", 4);
        System.out.println(anjing2.getNama() + " berumur " + anjing2.getUmur() + " tahun.");
        
        anjing2.setNama("Rocky");
        System.out.println("Nama baru anjing adalah: " + anjing2.getNama());
        
        Hewan[] hewanArray = {kucing, anjing, burung};
        
        for (Hewan hewan : hewanArray) {
            hewan.suara();
        }
    }
}
