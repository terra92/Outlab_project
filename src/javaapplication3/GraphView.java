package javaapplication3;

import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.graph.Forest;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.apache.commons.collections15.Transformer;


public final class GraphView {
    /**
    *
    * @author Terra
    */
    private Forest<Vertex,Edge> graph;
    private BasicVisualizationServer<Vertex, Edge> Basic;
    private TreeLayout<Vertex,Edge> treeLayout;
    private final JFrame Tree = new JFrame("GraphView");
    private Transformer<Vertex, String> vertex_valueString;
    Graph g1 = new Graph();
    
    public Forest<Vertex, Edge> Build_Arrays_On_Delegate(Graph g1) {
        graph = new DelegateForest<>();
        for(int i=0;i< g1.getList_vertex().size(); i++) {
            //System.out.println(g1.getList_vertex().get(i).getVertex_value());
            graph.addVertex(g1.getList_vertex().get(i));  
        }
        for(int j=0;j<g1.getList_edges().size(); j++) {
                //graph.addEdge(j, g1.getList_edges().get(j).getVertex1().getVertex_value(), g1.getList_edges().get(j).getVertex2().getVertex_value());
                graph.addEdge(g1.getList_edges().get(j),g1.getList_edges().get(j).getVertex1(), g1.getList_edges().get(j).getVertex2());
        }
        return graph;
    }
    
    public void Visualizer() {
        Basic = new BasicVisualizationServer<>(treeLayout = new TreeLayout<>(graph), new Dimension(900, 900));
        Basic.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<Edge>());
        Basic.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Vertex>());
        Tree.getContentPane().add(Basic);
        Tree.pack();
        Tree.setVisible(true);
    }

    public GraphView(Graph g1) {
        graph = Build_Arrays_On_Delegate(g1);
        Visualizer();  
    }        
}
    

  
