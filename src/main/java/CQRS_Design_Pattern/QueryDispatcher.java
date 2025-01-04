package CQRS_Design_Pattern;

// Query Dispatcher
public class QueryDispatcher {
    public <T> T dispatch(Query<T> query) {
        return query.execute();
    }
}
