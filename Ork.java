package DBS;

public class Ork extends Einheit implements Krieger,SchwereRuestung{

    public Ork() {
        super();
        // TODO Auto-generated constructor stub
    }


    public boolean kannAngreifen(Einheit ziel) {
        if (ziel instanceof Mensch || ziel instanceof Zwerg || ziel instanceof Schaf) {
            return true;
        }
        return false;
    }

}
