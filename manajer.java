
package inheritance;


public class manajer extends pegawai{
    public String departemen;
    public manajer(){
        System.out.println("Konstruktor manajer running");
    }
    
    public manajer (String n, double hr, String d){
        super(n, hr);
        System.out.println("Konstruktor manajer running");
        departemen = d;
    }
    
    public void isidata(String n, double hr, String d){
        super.isidata(n, hr);
        departemen = d;
    }
    public void display(){
        System.out.println("nama = " + nama + " gaji = " + gaji + " departemen = " + departemen);
    }
}
