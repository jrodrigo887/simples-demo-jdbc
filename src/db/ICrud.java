package db;

public interface ICrud<T> {
    public T create();
    public T[] read();
    public T update();
    public void delete();
}
