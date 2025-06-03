package hus.oop.vector;

public abstract class MyAbstractVector implements MyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     * @return
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder("[");

        for (int i = 0; i < size(); i++){
            s.append(coordinate(i));
            if (i < size() - 1){
                s.append(" ");
            }
        }

        s.append("]");
        return s.toString();
    }
    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng kích thước và có các phần tử bằng nhau.
     * @param another
     * @return
     */
    @Override
    public boolean equals(MyVector another) {
        /* TODO */
        int n = this.size();
        int m = another.size();

        if(n != m){
            return false;
        }

        for(int i = 0; i < n; i++){

            if(this.coordinate(i) != anothor.coordinate(i)){
                return false;
            }

        }

        return true;

    }
}
