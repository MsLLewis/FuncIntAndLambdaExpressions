public class LambdaExpressions {

    /**
     * () -> {} // No parameters, with curly parentheses, expression body, void result
     */
    public void useNoParam(){
        Human HMsg = () -> {
            System.out.println("No params with curly braces");
        };
        HMsg.say();
    }

    /**
     * () -> statement/expression  //No parameters, without parentheses,expression body, void result
     */

    public void useNoParamNoParenthesis(){
        Human HMsg = () -> System.out.println("No params and without curly braces");
        HMsg.say();
    }

    /**
     * using: n → System.out.print(n)  // One parameter, without round bracket and curly parentheses
     */
     public void useOneParamNoBracketAndParenthesis(){
         HumanTwo HM2msg = st -> System.out.println(st + "One parameter, without round bracket and curly parentheses");
         HM2msg.say("Hello | ");
     }


}
