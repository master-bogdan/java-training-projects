package org.draw_staircases;

public class Staircase {
  private int steps;
  private int stepWidth;

  public Staircase(int numSteps, int stepWidth) {
    this.steps = numSteps;
    this.stepWidth = stepWidth;
  }

  public void drawStaircase() {
    for (int i = 0; i < steps; i++) {
      for (int k = 0; k < (i + 1) * stepWidth; k++) {
          System.out.print("*");
      }
      System.out.println("");
    }
  }
}
