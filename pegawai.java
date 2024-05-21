
package inheritance;


public class pegawai {
    protected String nama;
    protected double gaji;
    
    public pegawai(){
        System.out.println("Konstruktor pegawai running");
    }
    public pegawai (String n, double hr){
        System.out.println("Konstruktor pegawai running");
        nama = n;
        gaji = hr;
    }
    
    public void isidata(String n, double hr){
        nama = n;
        gaji = hr;
    }
    public void display (){
        System.out.println("Nama = \n" + nama + " Gaji = \n" + gaji);
    }
    public String tostring(){
        return "hasil tostring nama = \n" + nama + " Gaji = \n" + gaji + "manajer\n";
    }
}
