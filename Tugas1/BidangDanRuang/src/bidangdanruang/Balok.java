package bidangdanruang;

import interfacePackage.MenghitungRuang;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    
    public float tinggi;

    public Balok(float panjang, float lebar, float tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public float luasPermukaan(){
        return 2 * super.luas() + 2 * panjang * tinggi + 2 * lebar * tinggi;
    }

    @Override
    public float volume() {
        return super.luas() * tinggi;
    }
    
}
