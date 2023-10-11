public class Lasagna {
    int ovenTimeReq = 40;
    int eachLayerTime = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return ovenTimeReq;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time){
        return ovenTimeReq-time;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return eachLayerTime*layers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers,int ovenTime){
        return layers*eachLayerTime+ovenTime;
    }
}
