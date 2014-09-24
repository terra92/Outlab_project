/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import static java.lang.Math.floor;
import java.util.ArrayList;

/**
 *
 * @author Terra
 */
public class HeapVertex extends Vertex {
    
    private int index_location;
    private Integer heap_value;
    private String Vertex_ValueString;
    private HeapVertex heapP;
    private HeapVertex LeftHeap;
    private HeapVertex RightHeap;

    public Integer getHeap_value() {
        return heap_value;
    }

    public void setHeap_value(Integer heap_value) {
        this.heap_value = heap_value;
    }

    
    public int getIndex_location() {
        return index_location;
    }

    public void setIndex_location(int index_location) {
        this.index_location = index_location;
    }

    public String getVertex_ValueString() {
        return Vertex_ValueString;
    }

    public void setVertex_ValueString(String Vertex_ValueString) {
        this.Vertex_ValueString = Vertex_ValueString;
    }

    public HeapVertex getHeapP() {
        return heapP;
    }

    public void setHeapP(HeapVertex heapP) {
        this.heapP = heapP;
    }

    public HeapVertex getLeftHeap() {
        return LeftHeap;
    }

    public void setLeftHeap(HeapVertex LeftHeap) {
        this.LeftHeap = LeftHeap;
    }

    public HeapVertex getRightHeap() {
        return RightHeap;
    }

    public void setRightHeap(HeapVertex RightHeap) {
        this.RightHeap = RightHeap;
    }

    public HeapVertex(Integer heap_value) {
        super(heap_value);
    }
    
    
    @Override
    public String toString() { 
        return "Vertex Value: "+this.heap_value.toString() + " Vertex index Position: "+Integer.toString(index_location) ;
    }
    
    
    
}
