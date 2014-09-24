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
public class BinaryTreeVertex extends Vertex {

    private BinaryTreeVertex ParentTreeVertex;
    private BinaryTreeVertex left_child;
    private BinaryTreeVertex right_child;
        
    public BinaryTreeVertex(Integer vertex) {
        super(vertex);
    }
    public BinaryTreeVertex getParentTreeVertex() {
        return ParentTreeVertex;
    }
    public BinaryTreeVertex getLeft() {
        return left_child;
    }
    public BinaryTreeVertex getRight() {
        return right_child;
    }
    public void setParentTreeVertex(BinaryTreeVertex ParentTreeVertex) {
        this.ParentTreeVertex = ParentTreeVertex;
    }
    public void setLeft(BinaryTreeVertex Left_child) {
        this.left_child = Left_child;
    }
    public void setRight(BinaryTreeVertex right_child) {
        this.right_child = right_child;
    }
}
