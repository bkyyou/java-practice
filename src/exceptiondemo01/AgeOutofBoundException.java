package src.exceptiondemo01;

public class AgeOutofBoundException extends RuntimeException {

  public AgeOutofBoundException() {
  }

  public AgeOutofBoundException(String message) {
    super(message);
  }
  
}
