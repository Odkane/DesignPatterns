package creational.objectpool.example2;

import java.util.Enumeration;
import java.util.Hashtable;

public abstract class ObjectPool<T> {
    private final long expirationTime;

    private final Hashtable<T, Long> locked, unlocked;

    public ObjectPool() {
        expirationTime = 30000; // 30 seconds
        locked = new Hashtable<>();
        unlocked = new Hashtable<>();
    }

    protected abstract T create();

    public abstract boolean validate(T o);

    public abstract void expire(T o);

    public synchronized T checkOut() {
        long now = System.currentTimeMillis();
        T object;
        if (unlocked.size() > 0) {
            Enumeration<T> elements = unlocked.keys();
            while (elements.hasMoreElements()) {
                object = elements.nextElement();
                if ((now - unlocked.get(object)) > expirationTime) {
                    // object has expired
                    unlocked.remove(object);
                    expire(object);
                } else {
                    if (validate(object)) {
                        unlocked.remove(object);
                        locked.put(object, now);
                        return (object);
                    } else {
                        // object failed validation
                        unlocked.remove(object);
                        expire(object);
                    }
                }
            }
        }
        // no objects available, create a new one
        object = create();
        locked.put(object, now);
        return (object);
    }

    public synchronized void checkIn(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}