public class Player {
    String nama;
    int level;
    int healthPoints;

    // Constructor
    public Player(String namaPlayer, int levelAwal) {
        nama = namaPlayer;
        level = levelAwal;
        // Kita bisa menetapkan nilai default berdasarkan logika tertentu
        healthPoints = levelAwal * 100; 
    }

    public void status() {
        System.out.println("--- Status Karakter ---");
        System.out.println("Nama   : " + nama);
        System.out.println("Level  : " + level);
        System.out.println("HP     : " + healthPoints);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        // Membuat dua karakter berbeda dengan satu constructor
        Player pemain1 = new Player("Aragon", 5);
        Player pemain2 = new Player("Legolas", 12);

        pemain1.status();
        pemain2.status();
    }
}
