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
    public void modelwerteInitialisieren(){
        model.paddleA.setSize(20, 100);
        model.paddleB.setSize(20, 100);
        model.paddleA.setPosition(0.0f, 600.0f / 2.0f - (model.paddleA.height / 2.0f));
        model.paddleB.setPosition(800.0f - (model.paddleB.width), 600.0f / 2.0f - (model.paddleB.height / 2.0f));
        model.ball.setSize(20, 20);
        model.ball.setPosition(400.0f, 300.0f);
        model.scoreA = 0;
        model.scoreA = 0;
    }

}
