package DBS;

import java.util.Random;

public abstract class Einheit implements Comparable<Einheit> {
    private int lebenspunkte;
    Random random = new Random();
    private int initiative;

    public Einheit() {
        this.lebenspunkte = 20;
        this.setInitiative(random.nextInt(100));
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public boolean lebtNoch() {
        if (this.lebenspunkte > 0) {
            return true;
        }
        // TODO Auto-generated method stub
        return false;
    }

    public void attackiere(Einheit ziel) {// Punkte weg hier
        int schaden = 2;
        if (this instanceof Fernkampf) {
            schaden += 2;
        }
        if (ziel instanceof SchwereRuestung && !(this instanceof Gift)) {
            schaden = (int) (0.5 * schaden);
        }
        if (this instanceof Gift && ziel instanceof SchwereRuestung) {
            schaden = (int) (0.5 * schaden + 2);
        }
        if (this instanceof Gift && !(ziel instanceof SchwereRuestung)) {
            schaden += 2;
        }
        try{
            ziel.werdeAngegriffen(schaden);}catch(SchafException e){
                Schaf.class.
            }

    }

    public boolean kannAngreifen(Einheit ziel) {
        // TODO Au to-generated method stub
        return false;
    }

    public void werdeAngegriffen(int schaden) {
        this.lebenspunkte = this.getLebenspunkte() - schaden;
    }

    public int compareTo(Einheit other) {
        return Integer.compare(this.getInitiative(), other.getInitiative());
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

}
