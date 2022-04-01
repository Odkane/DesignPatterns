package behavioral.nullobject;

import java.time.LocalDateTime;

public class Order {
    private final LocalDateTime orderTime;
    private final String article;

    public Order(LocalDateTime orderTime, String article) {
        this.orderTime = orderTime;
        this.article = article;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public String getArticle() {
        return article;
    }
}
