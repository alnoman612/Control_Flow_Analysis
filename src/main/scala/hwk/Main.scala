
package hwk;

import java.io.File
 

object Main {
  def main(args: Array[String]) { 
    val ast1 = GenerateAST(new File("test/simple.js"))
    val ast = GenerateAST(new File("test/while.js"))
    //val ast3 = GenerateAST.apply()
    ast.prep
    
    print(ast)
    
    ast.buildGraph
    
    println
    
    print(ast.toDotGraph)

  }
}
