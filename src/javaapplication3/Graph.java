/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;
import java.util.ArrayList;
/**
 *
 * @author Terra
 */
public class Graph {
    
    private ArrayList<Vertex> list_vertex = new ArrayList<Vertex>();
    private ArrayList<Edge> list_edges = new ArrayList<Edge>();
    
    
    public void add_vertex(Vertex vertex) {
        list_vertex.add(vertex);
    }
    
    public void add_egde(Edge edge) {
        list_edges.add(edge);
    }

    public ArrayList<Vertex> getList_vertex() {
        return list_vertex;
    }

    public ArrayList<Edge> getList_edges() {
        return list_edges;
    }
    
  
    public void remove_from_arrayVertex(Vertex vertex_delete){
        list_vertex.remove(vertex_delete);
        
    }
    
    public void remove_from_arrayEdge(Edge edge_delete){
        list_edges.remove(edge_delete);   
    }
    
    public void remove_allEdges() {
        list_edges. clear();
    }
}
