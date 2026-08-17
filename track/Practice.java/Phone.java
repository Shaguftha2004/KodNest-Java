
class Phone {

    String password;
    int pin;
    Pattern p;
    FaceLock f;
    FingerPrint l;

    void unlock(String text) {
        System.out.println("Unlocked the Alphabet");
    }

    void unlock(int number) {
        System.out.println("Unlocked the number");
    }

    void unlock(pattern p) {
        System.out.println("Unlocked the pattern");
    }

    void unlock(FaceLock f) {
        System.out.println("Unlocked the Face");
    }

    void unlock(FingerPrint l) {
        System.out.println("Unlocked the FingerPrint");
    }
}
