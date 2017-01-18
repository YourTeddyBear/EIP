package DBS;

public class Mensch extends Einheit implements Krieger,SchwereRuestung,Fernkampf{

    public Mensch() {
        super();
        // TODO Auto-generated constructor stub
    }


    public boolean kannAngreifen(Einheit ziel) {
        if (ziel instanceof Ork || ziel instanceof Goblin || ziel instanceof Schaf) {
            return true;
        }
        return false;
    }

}
