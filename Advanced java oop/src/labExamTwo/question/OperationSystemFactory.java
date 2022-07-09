
package labExamTwo.question;
public class OperationSystemFactory {
    public DeliveryCharge getInstance(String str)

    {
    if("standrad".equalsIgnoreCase(str)){
        return  new Standard();

    }
    
     if("standrad".equalsIgnoreCase(str)){

         return  new Express();
     }

    else{
         return null;
     }

    
    }
}
