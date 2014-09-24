/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author Terra
 */

   
/* References:
http://www.grotto-networking.com/JUNG/JUNG2-Tutorial.pdf
INTRODUCTION TO ALGORITHMS 3ed (THOMAS H. CORMEN CHARLES E. LEISERSON RONALD L. RIVEST CLIFFORD STEIN)
*/  

public class main {
    public static void main(String[] args) {
        
        Graph graph =new Graph();
        BinaryTree Binary = new BinaryTree();
        Heap heap = new Heap();
       
        

        BinaryTreeVertex v1 = new BinaryTreeVertex(100);
        BinaryTreeVertex v2 = new BinaryTreeVertex(150);
        BinaryTreeVertex v3 = new BinaryTreeVertex(50);
        BinaryTreeVertex v4 = new BinaryTreeVertex(25);
        BinaryTreeVertex v5 = new BinaryTreeVertex(75);
        BinaryTreeVertex v6 = new BinaryTreeVertex(40);
        BinaryTreeVertex v7 = new BinaryTreeVertex(30);
        BinaryTreeVertex v8 = new BinaryTreeVertex(20);
        
        graph.add_vertex(Binary.Tree_Insert(v1));
        graph.add_vertex(Binary.Tree_Insert(v2));
        graph.add_vertex(Binary.Tree_Insert(v3));
        graph.add_vertex(Binary.Tree_Insert(v4));
        graph.add_vertex(Binary.Tree_Insert(v5));
        graph.add_vertex(Binary.Tree_Insert(v6));
        graph.add_vertex(Binary.Tree_Insert(v7));
        graph.add_vertex(Binary.Tree_Insert(v8));
        
        
        HeapVertex hv1 = new HeapVertex(100);
        HeapVertex hv2 = new HeapVertex(150);
        HeapVertex hv3 = new HeapVertex(50);
        HeapVertex hv4 = new HeapVertex(25);
        HeapVertex hv5 = new HeapVertex(75);
        HeapVertex hv6 = new HeapVertex(40);
        HeapVertex hv7 = new HeapVertex(30);
        HeapVertex hv8 = new HeapVertex(20);
        
        heap.add_heap(hv1.getHeap_value());
        heap.add_heap(hv2.getHeap_value());
        heap.add_heap(hv3.getHeap_value());
        heap.add_heap(hv4.getHeap_value());
        heap.add_heap(hv5.getHeap_value());
        heap.add_heap(hv6.getHeap_value());
        heap.add_heap(hv7.getHeap_value());
        heap.add_heap(hv8.getHeap_value());

        /*
        //build the heap array
        heap.add_heap(0);
        for(int i=0; i < graph.getList_vertex().size(); i++ ) {
            heap.add_heap(graph.getList_vertex().get(i).getVertex_value());
        }
        */
        heap.Heapsort();
        
        
        
        
        //graph = Binary.Visualizer_Tree_InorderWalk();
        //new GraphView(graph);
        
    }
    
}
