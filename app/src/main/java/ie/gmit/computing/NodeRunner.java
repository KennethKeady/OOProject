package ie.gmit.computing;

import android.media.Image;
import android.widget.ImageView;

import java.io.*;

public class NodeRunner {
    public static void main(String[] args) throws Exception
    {
        Node root = new Node("Start", null);

        Node solid = new Node ("Solid", root);
        root.addChild(solid);

        Node flexible = new Node ("Flexible", root);
        root.addChild(flexible);

        Node hard = new Node ("Hard", solid);
        solid.addChild(hard);

        Node squashed = new Node ("Can be squashed", solid);
        solid.addChild(squashed);

        Node styrene = new Node ("Styrene", squashed);
        //ImageView iv= (ImageView)findViewById(R.id.styrene);
        //iv.setImageResource(R.drawable.styrene);
        squashed.addChild(styrene);

        //Save the tree......
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tree.ser"));

        out.writeObject(root);
        out.flush();
        out.close();

        //Load the tree
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("tree.ser")));

        root = (Node) in.readObject();
        System.out.println(root.getName());
    }
}
