package info.miguelcatalan.headfirst.designpatterns.adapter;

class WildTurkey implements Turkey {
    public String gobble() {
        return "Gobble gobble";
    }

    public String fly() {
        return "I'm flying a short distance";
    }
}
