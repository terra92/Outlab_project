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
public class BinaryTree extends Graph{
       
    private BinaryTreeVertex root;
    private BinaryTreeVertex walk;
    Graph g1 = new Graph();

    public BinaryTree() {
        
        super();
    }
    
    public BinaryTreeVertex Interative_Tree_Search(BinaryTreeVertex node, BinaryTreeVertex find) {
        while(node != null && find == node) {
        
            if(find.getVertex_value() < node.getVertex_value() ) {
                node = node.getLeft();
            }else {
                node = node.getRight();
            }
            
        }
        return node;
    }
    
    public BinaryTreeVertex Recursive_Tree_Search(BinaryTreeVertex node, BinaryTreeVertex find) {
        if(node == null || find != node) return node;
        if(find.getVertex_value() < node.getVertex_value()) {
            return(Recursive_Tree_Search(node.getLeft(), find));
        }else{
            return(Recursive_Tree_Search(node.getRight(), find));
        }
    }
    
    
    public Vertex Tree_Insert(BinaryTreeVertex insert_node) {
        BinaryTreeVertex aux = null;
        BinaryTreeVertex node = this.root;
        while(node != null) {
            aux = node;
            if(insert_node.getVertex_value()< node.getVertex_value()) {
                node = node.getLeft();
            }
            else node = node.getRight();
        }
        insert_node.setParentTreeVertex(aux);
        if (aux == null) {
            this.root = insert_node;
            return insert_node;        
        } //empty Tree, now the Root is The inserted one.
        else if(insert_node.getVertex_value() < aux.getVertex_value()) {
            aux.setLeft(insert_node);
            return insert_node;
        }
        else {
            aux.setRight(insert_node);
            return insert_node;
        }
    }  
    
    public void Transplant(BinaryTreeVertex replaced_node, BinaryTreeVertex sub_tree) {
        if(replaced_node.getParentTreeVertex() == null) {
            this.root = sub_tree;
        }else if(replaced_node == replaced_node.getParentTreeVertex().getLeft()) {
            replaced_node.getParentTreeVertex().setLeft(sub_tree);
        }else{
            replaced_node.getParentTreeVertex().setRight(sub_tree);
        }
        if(sub_tree != null) {
            sub_tree.setParentTreeVertex(replaced_node.getParentTreeVertex());
        }
    }
            
    public BinaryTreeVertex Tree_Minimum(BinaryTreeVertex node) {
        while(node.getLeft() != null) node = node.getLeft();
        return node;
    }        
    
    public void Tree_Delete(BinaryTreeVertex delete) {
        BinaryTreeVertex aux;
        if(delete.getLeft() == null) Transplant(delete, delete.getRight());
        else if(delete.getRight() == null) Transplant(delete, delete.getLeft());
        else {
            aux = Tree_Minimum(delete.getRight());
            if(aux.getParentTreeVertex() != delete) {
                Transplant(aux, aux.getRight());
                aux.setRight(delete.getRight());
                aux.getRight().setParentTreeVertex(aux);
            }
            Transplant(delete, aux);
            aux.setLeft(delete.getLeft());
            aux.getLeft().setParentTreeVertex(aux);
        }
        remove_from_arrayVertex(delete);
    }
    
    
    
    public void Inorder_Tree_Walk(BinaryTreeVertex walk){
        //System.out.println(walk.getVertex_value());      
        
        if(walk != null) {
            Inorder_Tree_Walk(walk.getLeft());
            if(walk.getParentTreeVertex() != null) {
                
                if(walk == walk.getParentTreeVertex().getLeft()) {
                    Edge e = new Edge("left",walk.getParentTreeVertex(), walk);
                    g1.add_egde(e);
                }else {
                    Edge e = new Edge("Rigth",walk.getParentTreeVertex(),walk);
                    g1.add_egde(e);
                }
            }
            Inorder_Tree_Walk(walk.getRight());
            
        }
    }
    
    public Graph Visualizer_Tree_InorderWalk() {
        
        //System.out.println(g1.getList_vertex().get(0).getVertex_value());
        g1.remove_allEdges();
        walk = this.root;
        Inorder_Tree_Walk(walk);
        return g1;
        
   
    }
}
