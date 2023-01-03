class StatDemostatic{
 StatDemostatic(){
 
    System.out.println(" In Constructor");
   }
 static{
    System.out.println(" In Static Block 1");
    }
   static{
    System.out.println(" In Static Block 2");
    }
   static{
    System.out.println(" In Static Block 3");
    }
public static void main(String args[]){
   System.out.println(" In Main Block ");
  StatDemostatic obj = new StatDemostatic();

 
}

}