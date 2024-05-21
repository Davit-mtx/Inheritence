
package inheritance;


public class testpegawai {


    public static void main(String[] args) {
        pegawai davit = new pegawai();
        davit.isidata("davit", 5000000);
        davit.display();
        
        System.out.println(davit);
        
        manajer luis = new manajer();
        luis.isidata("luis", 2500000, "teknik");
        
        System.out.println(luis);
        
        manajer ilyas = new manajer("ilyas", 3000000, "lead");
        ilyas.display();
    }
    
}
