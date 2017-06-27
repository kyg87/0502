import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class Program {

	public static void main(String[] args) throws RserveException, REXPMismatchException {
		// TODO Auto-generated method stub
		RConnection con = null;
		
		con = new RConnection();//±âº» 6311
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("data<-1:10;");
		stringBuilder.append("s<-sum(data);");
		
		double sum = con.eval(stringBuilder.toString()).asDouble();
		
		System.out.println(sum);
	}

}
