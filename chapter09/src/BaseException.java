import java.io.*;
public class BaseException extends Exception {
  protected Throwable cause = null;

  public BaseException(){}

  public BaseException(String msg){super(msg);}

  public BaseException( Throwable cause ) {
    this.cause =cause;
  }
  public BaseException(String msg,Throwable cause){
    super(msg);
    this.cause = cause;
  }
  
  public Throwable initCause(Throwable cause) {
    this.cause =cause;
    return this; 
  }

  public Throwable getCause() {
    return cause;
  }

  public void printStackTrace() {
    printStackTrace(System.err);
  }

  public void printStackTrace(PrintStream outStream) {
    printStackTrace(new PrintWriter(outStream));
  }

  public void printStackTrace(PrintWriter writer) {
    super.printStackTrace(writer);

    if ( getCause() != null ) {
      getCause().printStackTrace(writer);
    }
    writer.flush();
  }
}



/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/

 
