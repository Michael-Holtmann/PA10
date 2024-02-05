public class Die
{
    private int face;

    public Die() { face = (int)( 6 * Math.random() ) + 1;   }

    public int getFace() { return face; }
    
    public void roll() { face = (int)( 6 * Math.random() ) + 1; }
    
    public void flip() { face = 7 - face; }
    
    public boolean equals( Die x) { return this.getFace() == x.getFace(); }
    
    public int compareTo( Die x )
    {
        if( this.getFace() > x.getFace() )        return 1;
        else if (this.getFace() < x.getFace() )   return -1;
        return 0;   // must be equal!
    }
    
   public String toString() { return "" + this.getFace(); }
}
