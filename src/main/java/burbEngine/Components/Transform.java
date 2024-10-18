package burbEngine.Components;

import org.joml.Vector3f;

public class Transform {
    public Vector3f position;
    public Vector3f rotation;
    public Vector3f scale;

    public Transform() {
        position = new Vector3f();
        rotation = new Vector3f();
        scale = new Vector3f(1);
    }

    public void move(Vector3f position) {
        this.position.add(position);
    }

    public void rotate(Vector3f rotation) {
        this.rotation.add(rotation);
    }

    public void scale(Vector3f scale) {
        this.scale.mul(scale);
    }

    public void setPosition(Vector3f position) {
        this.position.set(position);
    }

    public void setRotation(Vector3f rotation) {
        this.rotation.set(rotation);
    }

    public void setScale(Vector3f scale) {
        this.scale.set(scale);
    }
}
