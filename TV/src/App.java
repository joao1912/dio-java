public class App {
    public static void main(String[] args) throws Exception {
        
        TV minhaTv = new TV();

        System.out.println("Tv Ligada: " + minhaTv.getIsOn());
        System.out.println("Tv Volume: " + minhaTv.getVolume());
        System.out.println("Tv Canal: " + minhaTv.getChannel());

        System.out.println("=======================");

        minhaTv.changeStateOn();
        minhaTv.moreVolume();
        minhaTv.changeChannel(13);

        System.out.println("Tv Ligada: " + minhaTv.getIsOn());
        System.out.println("Tv Volume: " + minhaTv.getVolume());
        System.out.println("Tv Canal: " + minhaTv.getChannel());

    }
}
