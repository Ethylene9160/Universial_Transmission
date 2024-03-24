public class Main {
    public static void main(String[] args) {
        BeProxyed bp = new BeProxyed();
        Proxy proxy = new Proxy(bp);
        proxy.proxySayHello("World");
    }
}

class Proxy {
    public Consumer consumer;

    public Proxy(Consumer consumer) {
        this.consumer = consumer;
    }

    public void proxySayHello(String msg) {
        consumer.sayHello(msg);
    }
}

interface Consumer {
    public void sayHello(String msg);
}

class BeProxyed implements Consumer {
    public void sayHello(String msg) {
        System.out.println("Hello, " + msg);
    }
}
