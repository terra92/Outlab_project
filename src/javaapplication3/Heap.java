/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import static java.lang.Math.floor;
import java.util.ArrayList;
import java.util.Collections;

//http://wiki.icmc.usp.br/images/c/c6/Ordenacao2.pdf
//http://www.ime.usp.br/~pf/analise_de_algoritmos/aulas/heap.html
/**
 *
 * @author Terra
 */
public class Heap extends BinaryTree{
    
    private ArrayList<Integer> heap_array = new ArrayList<Integer>();
    private HeapVertex root_heap;
    private HeapVertex node;
    
    public void add_heap(Integer heap) {
        heap_array.add(heap);
    }

    public ArrayList<Integer> getHeap_array() {
        return heap_array;
    }

    public void setHeap_array(ArrayList<Integer> heap_array) {
        this.heap_array = heap_array;
    }

    
    public Heap() {
        super();
    }
    
    public void Heapify(int index, int size) {
  
        int child = 2*index;
        int aux = this.heap_array.get(index);
        while (child<=size) {
            if((child < size)&&(getHeap_array().get(child)<getHeap_array().get(child+1))) {
                child++;
            }
            if(aux>= this.heap_array.get(child)) break;
            this.heap_array.set(index, this.heap_array.get(child));
            index = child;
            child = 2*index;
        }
        this.heap_array.set(index, aux);
    }
        
    
    public void Heapsort() {
       
       int down,max,aux;
       int size = this.heap_array.size()-1;
       for(down = size/2; down >=1; down--) {
           Heapify(down,size);
           
       }
       for(max = size; max>=1;max--) {
           aux = this.heap_array.get(1);
           this.heap_array.set(1,this.heap_array.get(max));
           this.heap_array.set(max,aux);
           Heapify(1,max-1);
       }
    }
    
    
    
    public void Heap_Position(HeapVertex node, int position) {
        node.setIndex_location(position);
        System.out.println(node);
    }
    
    
}
