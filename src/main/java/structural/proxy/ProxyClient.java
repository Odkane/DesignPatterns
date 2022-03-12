package structural.proxy;

public class ProxyClient {
    public static void main(String[] args) {

        System.out.println("\n\n======================================================");
        System.out.println("\t\t\tProxy Weather Forecast Demo");
        System.out.println("======================================================");
        ProxyWeather proxyCall = new ProxyWeather();
        proxyCall.whoAmI();
    }
}
