class Logger{
    private static Logger instance;

    private Logger(){
        System.out.println("New Instance of Logger Created");
    }

    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }

        return instance;
    }
}

public class Main {
    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if(logger1==logger2){
            System.out.println("Both logger 1 and logger 2 refer to the same instance");
        }
        else{
            System.out.println("logger 1 and logger 2 are difference instances");
        }
    }
}