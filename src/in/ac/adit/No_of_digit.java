package in.ac.adit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class No_of_digit extends HttpServlet
{
	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException 
	{
		PrintWriter out = res.getWriter();
		int count=0;
		
		int i=Integer.parseInt(req.getParameter("num"));
		int j=i;
		while(j>1)
		{
			j=j/10;
			count++;
		}
		out.println("Number of digit/s in " + i + " s: " +count);
	}
}
