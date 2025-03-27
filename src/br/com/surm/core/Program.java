package br.com.surm.core;

import java.util.ArrayList;

/**
 * 
 * This class implements the notion of program to Unlimited Register Machine.
 * 
 * @author Valdigleis (valdigleis@dimap.ufrn.br)
 * @author Marcos Fontes (marcosfontesjp2001@gmail.com)
 * @version 1.0
 */
public class Program {
  
  private ArrayList<Instruction> instructions;

  /**
   * Constructor method of the Program class, using an object ArrayList of instruction.
   * 
   * @param instructions The arraylist that contains the instructions.
   */
  public Program(ArrayList<Instruction> instructions){
    this.instructions = instructions;
  }

  /**
   * 
   * Constructor method of the Program class, using an array of instruction.
   * 
   * @param instructions The array that contains the instructions.
   */
  public Program(Instruction[] instructions){
    this.instructions = new ArrayList<>();
    for (Instruction instruction : instructions) {
      this.instructions.add(instruction);
    }
  }

}
