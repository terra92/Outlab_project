/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author c35q395
 */
public class Edge {
    
    private Integer edge_size;
    private Vertex vertex1;
    private Vertex vertex2;
    private String edge_label;
    
    @Override
    public String toString() { 
        return edge_label + "";
    }
    
    public Edge(String edge_label, Vertex vertex1, Vertex vertex2) {
        this.edge_label = edge_label;
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public Integer getEdge_size() {
        return edge_size;
    }
    
    
    public Vertex getVertex1() {
        return vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }

    public void setEdge_size(Integer edge_size) {
        this.edge_size = edge_size;
    }

    public void setVertex1(Vertex vertex1) {
        this.vertex1 = vertex1;
    }

    public void setVertex2(Vertex vertex2) {
        this.vertex2 = vertex2;
    }

    public String getEdge_label() {
        return edge_label;
    }

    public void setEdge_label(String edge_label) {
        this.edge_label = edge_label;
    }
    
    
}
