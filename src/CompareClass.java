public class CompareClass {

    GenericFuncInterface<Integer> compareIntegers = new GenericFuncInterface<Integer>() {
        @Override
        public Integer compare(Integer a, Integer b) {
           if(a > b){
               return a;
           }else {
               return b;
           }
        }
    };


    GenericFuncInterface<String> compareStrings = new GenericFuncInterface<String>() {
        @Override
        public String compare(String a, String b) {
            if(a.equals(b)){
                return "true";
            }else {
                return "false";
            }
        }
    };
}
