package hus.oop.vector;

public class MyArrayVector extends MyAbstractVector {
    private static final int DEFAULT_CAPACITY = 16;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        this.data = new double[DEFAULT_CAPACITY]; 
        this.size = 0; 
    }

    @Override
    public int size() {
        /* TODO */

        return this.size;
    }

    @Override
    public double coordinate(int index) {
        /* TODO */

        return data[index];

    }

    @Override
    public double[] coordinates(){

        double[] result = new double[this.size];

        System.arraycopy(this.data, 0, result, 0, this.size);

        return result;

    }

    @Override
    public MyArrayVector insert(double value) {
        if(size == data.length){

            this.allocateMore();

        }

        data[size] = value;
        ++size;

        return this;

    }

    @Override
    public MyArrayVector insert(double value, int index) {
        /* TODO */


        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Quá phạm vi mảng");
        }

        if(size == data.length){

            this.allocateMore();

        }

        for(int i = size; i >= index + 1; i--){

            data[i] = data[i - 1];

        }

        data[index] = value;
        ++size;

        return this;

    }

    @Override
    public MyArrayVector remove(int index) {
        /* TODO */
    }

    @Override
    public MyArrayVector extract(int[] indices) {
        /* TODO */
    }

    @Override
    public void set(double value, int index) {
        /* TODO */

        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Quá phạm vi mảng");
        }

        data[index] = value;

    }

    @Override
    public MyArrayVector add(double value){
        MyArrayVector result = new MyArrayVector();

        for (int i = 0; i < this.size; i++){

            result.insert(this.data[i] + value);

        }

        return result;
    }

    @Override
    public MyArrayVector add(MyVector another){
        if(this.size != another.size()){

            throw new IllegalArgumentException("Hai vector phải cùng độ dài");

        }

        MyArrayVector result = new MyArrayVector();
        for (int i = 0; i < this.size; i++){

            result.insert(this.data[i] + another.coordinate(i));

        }

        return result;
    }

    @Override
    public MyArrayVector addTo(double value){

        for (int i = 0; i < this.size; i++){

            this.data[i] += value;

        }

        return this;
    }

    @Override
    public MyArrayVector addTo(MyVector another){
        if(this.size != another.size()){

            throw new IllegalArgumentException("Hai vector phải cùng độ dài");

        }
        for (int i = 0; i < this.size; i++){

            this.data[i] += another.coordinate(i);

        }

        return this;
    }

    @Override
    public MyArrayVector minus(double value){

        MyArrayVector result = new MyArrayVector();

        for (int i = 0; i < this.size; i++){

            result.insert(this.data[i] - value);

        }

        return result;
    }

   @Override
    public MyArrayVector minus(MyVector another) {
        if(this.size != another.size()){

            throw new IllegalArgumentException("Hai vector phải cùng độ dài");

        }

        MyArrayVector result = new MyArrayVector();
        for (int i = 0; i < this.size; i++){

            result.insert(this.data[i] - another.coordinate(i));

        }

        return result;
    }

    @Override
    public MyArrayVector minusFrom(double value){

        for (int i = 0; i < this.size; i++){

            this.data[i] -= value;

        }

        return this;
    }

    @Override
    public MyArrayVector minusFrom(MyVector another) {
        if(this.size != another.size()){

            throw new IllegalArgumentException("Hai vector phải cùng độ dài");

        }

        for (int i = 0; i < this.size; i++){

            this.data[i] -= another.coordinate(i);

        }

        return this;
    }

    @Override
    public double dot(MyVector another) {
        /* TODO */

        double ans = 0;

        if (this.size != another.size()){

            throw new IllegalArgumentException("Hai vector phải cùng độ dài");

        }


        for(int i = 0; i < size; i++){

            ans += this.coordinate(i) * another.coordinate(i);

        }

        return ans;
    }

    @Override
    public MyArrayVector pow(double power) {
        /* TODO */

        for (int i = 0; i < size; i++){

            this.set(Math.pow(data[i], power), i);

        }

        return this;
    }

    @Override
    public MyArrayVector scale(double value) {
        /* TODO */

        for (int i = 0; i < size; i++){

            this.set(data.get(i) * value, i);

        }

        return this;
    }

    @Override
    public double norm() {
        /* TODO */

        double ans = 0;

        for(int i = 0; i < size; i++){
            double x = data[i];
            
            ans += x*x;

        }

        return Math.sqrt(ans);
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     */
    private void allocateMore() {
        /* TODO */

        int newCapacity = data.length * 2;
        double[] newData = new double[newCapacity];

        System.arraycopy(data, 0, newData, 0, size);

        data = newData;

    }
}
