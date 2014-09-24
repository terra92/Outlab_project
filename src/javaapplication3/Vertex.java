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
public class Vertex {
    
    private Integer vertex_value;
    private String vertex_label;
    
   @Override
    public String toString() { 
        return vertex_value.toString() + "";
    }
    
    public Vertex(Integer vertex_value) {
        this.vertex_value = vertex_value;
    }

    public Integer getVertex_value() {
        return vertex_value;
    }
    
    public void setVertex_value(Integer vertex_value) {
        this.vertex_value = vertex_value;
    }
    
    public Integer toInteger(){
	return vertex_value;
    }

    public String getVertex_label() {
        return vertex_label;
    }

    public void setVertex_label(String vertex_label) {
        this.vertex_label = vertex_label;
    }
    
    
}