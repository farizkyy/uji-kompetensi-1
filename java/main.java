public class main {
    
    public static void main(String[] args) {

        kucing kucing = new kucing("Kitty", 2);
        anjing anjing = new anjing("Buddy", 3);
        burung burung = new burung("Tweety", 1);

        kucing.suara();
        anjing.suara();
        burung.suara();

        kucing.setUmur(3);
        System.out.println(kucing.getNama() + " sekarang berumur " + kucing.getUmur() + " tahun.");
        
        anjing anjing2 = new anjing("Max", 4);
        
        System.out.println(anjing2.getNama() + " berumur " + anjing2.getUmur() + " tahun.");
        

        anjing2.setNama("Rocky");
        System.out.println("Nama baru anjing adalah: " + anjing2.getNama());
        

        Hewan[] hewanArray = {kucing, anjing, burung};
        
        for (Hewan hewan : hewanArray) {
            hewan.suara();
        }
    }
}