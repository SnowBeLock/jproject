package edu.jcourse.lesson3;


public class MyTeamCalc {
    public static void main(String[] args) {
        if (args.length != 0) {
            double value1 = Double.parseDouble(args[0]);
            String operator = args[1];
            double value2 = Double.parseDouble(args[2]);
            double result=0;
            switch (operator) {
                case "+":
                    result=value1+value2;
                    break;
                case"-":
                    result=value1-value2;
                    break;
                case"*":
                    result=value1*value2;
                    break;
                case"/":
                    result=value1/value2;
                    break;
                case"%":
                    result=value1%value2;
                    break;
                case "poop":
                value1++;
                value2++;
                    result=value1+value2;
                    break;
                default:
                    System.out.println("Nah");
            }
//            if("+".equals(operator)){
//                result=value1+value2;
//            }
//            if("-".equals(operator)){
//                result=value1-value2;
//            }
//            if("*".equals(operator)){
//                result=value1*value2;
//            }
//            if("/".equals(operator)){
//                result=value1/value2;
//            }

            System.out.println("Result: " + result);
        } else {
            System.out.println("incorrect");
        }
    }
}
