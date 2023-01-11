package W1;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class App extends Application {

    private static void launch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param stage
     */
    @Override
    public void start(Stage stage) {
        //dotted line
        Line line1 = new Line(150, 140, 450, 140);
        line1.getStrokeDashArray().addAll(2d);
        Group root = new Group(line1);
        //Creating a scene object 
        Scene scene = new Scene(root, 600, 300);     
        //Setting title to the Stage 
        stage.setTitle("Drawing a dotted line");
        //Adding scene to the stage 
        stage.setScene(scene);
        stage.show();

        /*

//Creating a Path 
      Path path = new Path(); 
       
      //Moving to the starting point 
      MoveTo moveTo = new MoveTo(108, 71); 
        
      //Creating 1st line 
      LineTo line1 = new LineTo(321, 161);  
             
              
      //Creating 2nd line 
      LineTo line2 = new LineTo(126,232);       
       
      //Creating 3rd line 
      LineTo line3 = new LineTo(232,52);  
       
      //Creating 4th line 
      LineTo line4 = new LineTo(269, 250);   
       
      //Creating 4th line 
      LineTo line5 = new LineTo(108, 71);  
       
      //Adding all the elements to the path 
      path.getElements().add(moveTo); 
      path.getElements().addAll(line1, line2, line3, line4, line5);        
         
      //Creating a Group object  
      Group root = new Group(path); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);  
      
      //Setting title to the Stage 
      stage.setTitle("Drawing an arc through a path");
      
      //Adding scene to the stage 
      stage.setScene(scene);
      
      //Displaying the contents of the stage 
      stage.show();         

*/

   } 

    public static void main(String[] args) {
        launch();
    }

}