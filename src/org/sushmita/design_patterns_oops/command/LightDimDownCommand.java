package org.sushmita.design_patterns_oops.command;

public class LightDimDownCommand implements Command{
        private Light light;

        public LightDimDownCommand(Light light){
            this.light = light;
        }

        @Override
        public void execute() {
            light.dimDown();
        }

        @Override
        public void unExecute() {
            light.dimUp();
        }
}
