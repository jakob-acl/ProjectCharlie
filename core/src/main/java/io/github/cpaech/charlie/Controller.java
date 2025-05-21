package io.github.cpaech.charlie;

public class Controller {
    public Model model;
   
    public Controller(Model model) {
        this.model = model;
    }
    public void render(float delta) {
        // Update the game state based on user input and other factors
        // For example, move paddles, update ball position, check for collisions, etc.
        // This is where the game logic would go
    }
    public void dispose() {
        // Dispose of any resources that need to be cleaned up
        // For example, textures, sounds, etc.
    }
    public modelwerteInitialisieren(){
        model.PaddleA = new.Rectangle;
        model.PaddleB = new.Rectangle;
        model.Ball = new.Rectangle;
        model.BallVelocity = new.Vector2;
        model.ScoreA = 0;
        model.ScoreB = 0;
    }

}
