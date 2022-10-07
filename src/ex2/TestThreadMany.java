public class TestThreadMany {
    public static void main(String[] args){
        if(args.length>0){
            //System.out.println(Arrays.toString(args));
            int nbThreadToCreate= Integer.parseInt(args[0]);
            for (int i = 1; i < nbThreadToCreate+1; i++) {
                createThread("Thread #"+i).start();
            }
        }
    }

    private static ThreadNamed createThread(String s) {
        return new ThreadNamed(s);

    }
}
