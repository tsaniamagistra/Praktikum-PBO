package bidangdanruang;

import interfacePackage.MenghitungBidang;

public class Lingkaran implements MenghitungBidang {
    
    public static final float phi = (float) 3.14;
    public float r;
    
    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float luas() {
        return phi*r*r;
    }

    @Override
    public float keliling() {
        return phi*2*r;
    }

}
