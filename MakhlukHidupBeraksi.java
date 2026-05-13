abstract class MakhlukHidup {
    abstract void bernapas();
}

class Manusia extends MakhlukHidup {
    void bernapas() {
        System.out.println("Manusia bernapas dengan paru-paru");
    }
}

class HewanAbstrak extends MakhlukHidup {
    void bernapas() {
        System.out.println("Hewan bernapas dengan berbagai cara");
    }
}

public class MakhlukHidupBeraksi {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        manusia.bernapas(); // Output: Manusia bernapas dengan paru-paru

        MakhlukHidup hewan = new HewanAbstrak();
        hewan.bernapas(); // Output: Hewan bernapas dengan berbagai cara
    }
}