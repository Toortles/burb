package burbEngine.Utils;

import burbEngine.Application;
import burbEngine.Application.Vertex;
import org.joml.Vector3f;
import org.joml.Vector3fc;

import java.io.File;

import static org.lwjgl.assimp.Assimp.*;

class Mesh extends ModelLoader {
    Application.Vertex[] vertices;
    int[] indices;

    public Mesh (String filePath) {
        File modelFile = new File("models/suzanne.obj");
        Model mesh = ModelLoader.loadModel(modelFile, aiProcess_FlipUVs | aiProcess_DropNormals);

        final int vertexCount = mesh.positions.size();
        vertices = new Vertex[vertexCount];
        final Vector3fc color = new Vector3f(1.0f, 1.0f, 1.0f);

        for (int i = 0; i < vertexCount; i++) {
            vertices[i] = new Application.Vertex(mesh.positions.get(i), color, mesh.texCoords.get(i));
        }

        indices = new int[mesh.indices.size()];

        for (int i = 0; i < indices.length; i++) {
            indices[i] = mesh.indices.get(i);
        }
    }
}

public class Entity {

}
