package snipeitapp;

public enum WebServiceEndPoints {
    RATE_LIMIT("http://localhost/SOME_PATH/rate-limit"),
    REGISTRATION("http://localhost/SOME_PATH/registration");

    private final String url;

    WebServiceEndPoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
