package Liste_Sinifi_Yapmak;

public class MyList<T> {
    private T[] arr;
    private T[] tempArr;
    private int capacity = 10;
    private int count = 0;

    public MyList() {
        this.tempArr = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.tempArr = (T[]) new Object[capacity];
        this.capacity = capacity;
    }

    public void add(T data) {
        if(this.count < this.capacity) {
            this.tempArr[count] = data;
            this.count++;
        } else {
            pCapacity();
            this.arr[count] = data;
            count++;
        }
    }

    public void pCapacity() {
        this.capacity *= 2;
        this.arr = (T[]) new Object[this.capacity];
        for(int i = 0; i < this.tempArr.length; i++) {
            this.arr[i] = tempArr[i];
        }
    }

    public T get(int index) {
        T x = this.arr[index];
        return x;
    }

    public void remove(int index) {
        boolean checkPoint = false;
        if(index > this.capacity) {
            System.out.println("Geçersiz index.");
        }
        this.tempArr = this.arr;
        this.arr[index] = null;
        for(int i = 0; i < this.arr.length; i++) {
            if(checkPoint) {
                if(i == this.capacity - 1) {
                    continue;
                }
                this.arr[i] = this.tempArr[i + 1];
            }
            if(this.arr[i] == null) {
                if(i == this.capacity - 1) {
                    this.arr[i] = this.tempArr[i - 1];
                } else {
                    this.arr[i] = this.tempArr[i + 1];
                    checkPoint=true;
                }

            }
        }
    }

    public void set(int index, T data) {
        if(index > this.capacity) {
            System.out.println("Geçersiz index.");
        } else {
            this.arr[index] = data;
        }
    }

    public void printArr() {
        for(int i = 0; i < this.tempArr.length; i++) {
            System.out.println(this.tempArr[i]);
        }
    }

    public int indexOf(T data) {
        for(int i = 0; i < this.arr.length; i++) {
            if(this.arr[i] == data) {
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for(int i = 0; i < this.arr.length; i++) {
            if(data == this.arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if(this.arr == null) {
            return true;
        }
        return false;
    }

    public T[] toArray() {
        return this.arr;
    }

    public void clear() {
        for(int i = 0; i < this.tempArr.length; i++) {
            this.tempArr[i] = null;
        }
    }

    public MyList<T> sublist(int start, int end) {
        MyList<T> newList = new MyList<>(end - start);
        for(int i = start; i < end; i++) {
            newList.add(this.arr[i]);
        }
        return newList;
    }

    public boolean contains(T data) {
        for(int i = 0; i < this.tempArr.length; i++) {
            if(this.tempArr[i] == data) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.tempArr.length;
    }

    public T[] getArr() {
        return this.arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
