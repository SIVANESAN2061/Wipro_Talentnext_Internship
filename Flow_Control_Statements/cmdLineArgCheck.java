class cmdLineArgCheck{
    public static void main(String[] args) {
        int k=args.length;

        if(k>0){
            for (int  i= 0;  i< k; i++) {
                System.out.println(args[i]);
            }
        }
        else
            System.out.println("No Values!");
    }
}