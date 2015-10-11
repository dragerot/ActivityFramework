package pakke;


import pakke.process.Aktivities;
import pakke.process.Input;
import pakke.process.Output;

public class Hoved {
    public static void main(String[] args) {
        System.out.println("<<<<<*********************Start******************>>>");
        Box<KodeBlokker>  box= new Box<KodeBlokker>(new KodeBlokker());
//        KodeBlokker kodeBlokker=box.get();
//        kodeBlokker.ex1();
//        System.out.println(kodeBlokker.toString());

        Request request= createRequest();
        Output<Respons> output;

        RegistreringActivities aktivities = new RegistreringActivities(request);
        aktivities.doA("AA").
                   doB("BB").
                   doC("CC");
        //aktivities.getResult();

        System.out.println(aktivities.getActivitylog().toString());

    }

    public static Request createRequest(){
        Request request = new Request();
        request.setSsn("030865229520");
        request.setName("Tore Gard");
        request.setAddress("Øvre Movei 23");
        return request;
    }

}
