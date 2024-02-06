package jGame.main;

import jGame.display.Display;
import jGame.exception.BuilderException;
import jGame.loop.render.Render;
import jGame.loop.render.Render2D;
import jGame.loop.update.Update;

public class Game {
    public static class Builder {
        private Render render;
        private Update update;
        private Display display;

        public Builder() {
            render = null;
            update = null;
            display = null;
        }

        public Builder setRender(Render render) {
            this.render = render;
            return this;
        }

        public Builder setUpdate(Update update){
            this.update = update;
            return this;
        }

        public Builder setDisplay(Display display){
            this.display = display;
            return this;
        }

        public Game build() {
            render = render == null ? new Render2D() : render;
            update = update == null ? new Update() : update;
            if(display == null){
                throw new BuilderException("Missing required argument: Display");
            }
            return new Game(render);
        }
    }

    private Render render;

    private Game(
            Render render
    ){
        this.render = render;
    }

    public Render getRender(){
        return render;
    }
}
