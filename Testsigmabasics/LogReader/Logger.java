public class Logger {
    private String id;
    private String errorCode;
    private String message;

    public Logger(String id, String errorCode, String message) {
        this.id = id;
        this.errorCode = errorCode;
        this.message = message;
    }
    void getDetails()
    {
        System.out.println("ID:"+id+"\nError Code:"+errorCode+"\nMessage:"+message);
    }
}
