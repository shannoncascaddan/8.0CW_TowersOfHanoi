public class TowersOfHanoi
{
    private int totalDisks;

    public TowersOfHanoi(int disks)
    {
        totalDisks = disks;
    }//end constr
    public void solve()
    {
        moveTower(totalDisks,1,3,2);
    }//ens solve w call to moveTower
    private void moveTower(int numDisks, int start, int end, int temp)
    {
        if(numDisks == 1)
            moveOneDisk(start, end);
        else
        {
            moveTower(numDisks-1, start, temp,end);
            moveOneDisk(start, end);
            moveTower(numDisks-1, temp, end ,start);
        }//end else
    }//end move tower method

    private void moveOneDisk(int start, int end)
    {
        System.out.println("Move one disk from "+start+" to "+end);
    }//end method to move one disk
}//end class
