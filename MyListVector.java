package hus.oop.vector;

import java.util.List;

public class MyListVector extends MyAbstractVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        /* TODO */
        this.data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return this.data.size;
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        
        // throw exception here ! =))
        if (index < 0 || index >= data.size()) {
            throw new IndexOutOfBoundsException("Vượt quá rồi bạn ơi !");
        }

        return data.get(index);

    }

    @Override
    public double[] coordinates() {
        /* TODO */

        double[] dataVector = new double[data.size()]; 

        int i = 0;

        for (Double x : data){ 

            dataVector[i] = x;
            i++;

        }
        return dataVector;

    }


    public List<Double> coordinatesList() {
        return new ArrayList<>(data);
    }

    @Override
    public MyListVector insert(double value) {
        /* TODO */

        data.add(value);
        return this;
    }

    @Override
    public MyListVector insert(double value, int index) {
        /* TODO */


        if (index < 0 || index > data.size()) {
            throw new IndexOutOfBoundsException("Vượt quá rồi bạn ơi !");
        }

        data.add(index, value); // chèn vào đúng vị trí
        return this;

    }

    @Override
    public MyListVector remove(int index) {
        /* TODO */
    }

    @Override
    public MyListVector extract(int[] indices) {
        /* TODO */
    }

    @Override
    public void set(double value, int index) {
        /* TODO */

        if (index < 0 || index > data.size()) {
            throw new IndexOutOfBoundsException("Vượt quá rồi bạn ơi !");
        }

        data.set(index, value);
    }

    @Override
    public MyListVector add(double value) {
        /* TODO */

        MyListVector result = new MyListVector();
        for (Double x : this.data){

            result.data.add(x + value);

        }

        return result;

    }

    @Override
    public MyListVector add(MyVector another) {
        /* TODO */

        if (this.data.size() != another.size()) {
            throw new IllegalArgumentException("Hai vector phải cùng độ dài");
        }

        MyListVector result = new MyListVector();

        for (int i = 0; i < this.size(); i++){

            result.data.add(this.data.get(i) + another.coordinate(i));

        }

        return result;

    }

    @Override
    public MyVector addTo(double value){

        for (int i = 0; i < data.size(); i++){

            this.set(data.get(i) + value, i);

        }

        return this;
    }

    @Override
    public MyVector addTo(MyVector another){

        if (this.data.size() != another.size()){
            throw new IllegalArgumentException("Hai vector phải cùng độ dài");
        }

        for (int i = 0; i < data.size(); i++){

            this.set(data.get(i) + another.coordinate(i), i);

        }

        return this;
    }

    @Override
    public MyListVector minus(double value){

        MyListVector result = new MyListVector();
        for (Double x : this.data){

            result.data.add(x - value);

        }
        return result;

    }


    @Override
    public MyListVector minus(MyVector another){

        if (this.data.size() != another.size()){
            throw new IllegalArgumentException("Hai vector phải cùng độ dài");
        }

        MyListVector result = new MyListVector();
        for (int i = 0; i < this.size(); i++){

            result.data.add(this.data.get(i) - another.coordinate(i));

        }

        return result;

    }

    @Override
    public MyListVector minusFrom(double value){

        for (int i = 0; i < this.data.size(); i++){

            this.set(this.data.get(i) - value, i);

        }
        return this;

    }

    @Override
    public MyListVector minusFrom(MyVector another){

        if (this.data.size() != another.size()){

            throw new IllegalArgumentException("Hai vector phải cùng độ dài");

        }

        for (int i = 0; i < this.data.size(); i++){

            this.set(this.data.get(i) - another.coordinate(i), i);

        }

        return this;
    }

    @Override
    public double dot(MyVector another) {
        /* TODO */

        double ans = 0;

        if (this.data.size() != another.size()){

            throw new IllegalArgumentException("Hai vector phải cùng độ dài");

        }


        for(int i = 0; i < data.size(); i++){

            ans += this.coordinate(i) * another.coordinate(i);

        }

        return ans;

    }

    @Override
    public MyVector pow(double power){

        for (int i = 0; i < data.size(); i++){

            this.set(Math.pow(data.get(i), power), i);

        }

        return this;
    }

    @Override
    public MyVector scale(double value){

        for (int i = 0; i < data.size(); i++){

            this.set(data.get(i) * value, i);

        }

        return this;
    }

    @Override
    public double norm() {
        /* TODO */

        double ans = 0;

        for(Double x : data){

            ans += x*x;

        }

        return Math.sqrt(ans);

    }
}
