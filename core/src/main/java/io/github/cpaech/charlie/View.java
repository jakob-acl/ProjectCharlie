package io.github.cpaech.charlie;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class View {
    private final Texture ball;
    private final SpriteBatch batch;
    Model model;
    public View(Model model) {
        this.model = model;
        batch = new SpriteBatch();
        ball = new Texture("ball.png");
    }
    public void render() {
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        batch.begin();
        batch.draw(ball, model.ball.x, model.ball.y);
        batch.end();
    }

    public void dispose() {
        batch.dispose();
        ball.dispose();
    }
}
