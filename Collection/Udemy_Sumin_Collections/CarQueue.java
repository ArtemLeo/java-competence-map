package Collection.Udemy_Sumin_Collections;

public interface CarQueue extends CarCollection {
    boolean add(Car car);

    Car peek();

    Car poll();
}
