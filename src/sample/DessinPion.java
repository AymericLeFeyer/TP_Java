package sample;

import javafx.scene.shape.Circle;

public class DessinPion extends Circle {
    private boolean selected;
    private Pion p;


    public DessinPion(Pion p, int taille, int radius, int xPos, int yPos) {
        // xPos et yPos sont les valeurs d'ecart pour le jeu
        super(xPos + p.getX()*taille, yPos + p.getY()*taille, radius);
        selected = false;
        this.p = p;

        setFill(p.getCouleur());
    }
}
