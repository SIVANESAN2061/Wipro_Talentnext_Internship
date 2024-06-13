class PercInterestGender{
    public static void main(String[] args) {
        String a = new String();
        a=args[0].toLowerCase();
        int b=Integer.parseInt(args[1]);

        if( a.equals("female")  && b>=1 && b<=58){
            System.out.println("The percentage of interest is 8.2%");
        } 
        else if( a.equals("female")  && b>=59 && b<=100){
            System.out.println("The percentage of interest is 9.2%");
        }
        else if( a.equals("male")  && b>=1 && b<=58){
            System.out.println("The percentage of interest is 8.4%");
        }
        else if( a.equals("male")  && b>=59 && b<=100){
            System.out.println("The percentage of interest is 10.5%");
        } 
        else{
            System.out.println("Enter a valid Arguments...!");
        }
    }
}