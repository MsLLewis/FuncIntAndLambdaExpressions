public class RegularClass {

    //No lambda

    //Annymous constructor one
    Human hObjone = new Human() {
        @Override
        public void say() {
            System.out.println("I am James.");
        }
    };

   //Annymous constructor two
    Human hObjTwo = new Human() {
       @Override
       public void say() {
           System.out.println("I am Tony.");
       }
   };



}
