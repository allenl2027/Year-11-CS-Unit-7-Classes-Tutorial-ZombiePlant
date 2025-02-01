public class ZombiePlant {
    private int mxPotentcy;
    private int reqTreatmts;

    public ZombiePlant(int pot,int req){
        mxPotentcy=pot;
        reqTreatmts=req;
    }

    public int getPotency(){
        return mxPotentcy;
    }

    public int treatmentsNeeded(){
        return reqTreatmts;
    }

    public boolean isDangerous(){
        return reqTreatmts>0;
    }

    public void treat(int potency){
        if(potency<=0) return;
        if(potency<=mxPotentcy){
            if(reqTreatmts>0) reqTreatmts--;
        }
        else reqTreatmts++;
    }
}
