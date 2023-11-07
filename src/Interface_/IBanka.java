package Interface_;

public interface IBanka {
    final String hostIpAddress = "127.0.0.1";
    boolean connect(String ipAddress);
    boolean sendCardInfo(double price, String cardNumber, String expireDate, String cvc);
}
