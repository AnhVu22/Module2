package repository;

public interface Repository<T> {
    void add(T item);
    void displayAll();
}
