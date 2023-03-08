package bidangdanruang;

import interfacePackage.MenghitungRuang;

public class Tabung extends Lingkaran implements MenghitungRuang {

    public float tinggi;
    
    public Tabung(float tinggi, float r) {
        super(r);
        this.tinggi = tinggi;
    }
    
    @Override
    public float luasPermukaan(){
        return 2 * super.luas() + super.keliling() * tinggi;
    }

    @Override
    public float volume() {
        return super.luas() * tinggi;
    }
    
}
