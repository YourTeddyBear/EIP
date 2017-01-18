package DBS;

public class Goblin extends Einheit implements Krieger, Fernkampf, Gift {

    public Goblin() {

        // TODO Auto-generated constructor stub
    }

    public boolean kannAngreifen(Einheit ziel) {
        if (ziel instanceof Mensch || ziel instanceof Zwerg || ziel instanceof Schaf) {
            return true;
        }
        return false;
    }

}
