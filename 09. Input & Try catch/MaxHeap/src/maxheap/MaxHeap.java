/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxheap;

/**
 *
 * @author LENOVO
 */
public class MaxHeap {

    private Integer[] heap; // khac voi int [5]
    //class obj, nhung o tao ra la null;
    private int size;

    public MaxHeap(int capacity) {
        heap = new Integer[capacity + 1];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void insert(int value) {
        if (size == heap.length - 1) {
            resize(heap.length * 2);
        }
        size++;
        heap[size] = value;
        swim(size);

    }

    public void swim(int k) {
        while (k > 1 && heap[k] > heap[k / 2]) {
            swap(k, k / 2);
        }
    }

    public void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    private void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println("");
    }

    public void resize(int newcapacity) {
        Integer[] tmp = new Integer[newcapacity];
        for (int i = 0; i <= heap.length; i++) {
            tmp[i] = heap[i];
        }
        heap = tmp;
    }

    public int delete(int i) {
        if(size == 0){
            throw new RuntimeException("heap is empty");
        }
        int max = heap[1];
        heap[1] = heap[size];
        size--;
        sink(1);
        return max;
    }

    public void sink(int k) {
        while (2 * k <= size) {
            if (2 * k + 1 > size) {
                if (heap[k] < heap[2 * k + 1]) {
                    swap(k, 2 * k);
                    k = 2 * k;
                }
            }
            if (heap[k] < heap[2 * k] || heap[k] < heap[2 * k + 1]) {
                if (heap[2 * k] > heap[2 * k + 1]) {
                    swap(k, 2 * k);
                    k = -2 * k;
                } else {
                    swap(k, 2 * k + 1);
                    k = 2 * k + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        MaxHeap myHeap = new MaxHeap(5);
        System.out.println("");
        myHeap.insert(40);
        myHeap.insert(50);
        myHeap.insert(20);
        myHeap.printHeap();
    }

}
