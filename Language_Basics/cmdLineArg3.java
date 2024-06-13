class cmdLineArg3{
    public static void main(String[] args) {
        int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        System.out.printf("The sum of the %s and %s is %d",args[0],args[1],sum);
    }
}