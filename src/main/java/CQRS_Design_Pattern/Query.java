package CQRS_Design_Pattern;

// Query Interface
public interface Query<T> {
    T execute();
}
