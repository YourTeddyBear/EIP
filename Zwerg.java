package DBS;

public class Zwerg extends Einheit implements Krieger,SchwereRuestung,Fernkampf{

    public Zwerg() {
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
