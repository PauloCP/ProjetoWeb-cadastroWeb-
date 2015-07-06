package br.com.paulocp.jdbc.classes.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.paulocp.jdbc.classes.Contato;
import br.com.paulocp.jdbc.classes.ContatoDAO;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


@WebServlet("/AdicionaContatoServlet")
public class AdicionaContatoServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException{
	
	PrintWriter out = response.getWriter();//busca o write
	
	//buscando parametros no request
	String nome = request.getParameter("nome");
	String endereco = request.getParameter("endereco");
	String email = request.getParameter("email");
	String dataEmTexto = request.getParameter("datanascimento");
	Calendar dataNascimento=null;
	
	//fazendo a conversão da data
	try{
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);//erro
		dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		}catch (ParseException e){
			out.println("Erro de converção");
			return;
		}

	//monta o objeto contato
	Contato contato = new Contato();
	contato.setNome(nome);
	contato.setEndereco(endereco);
	contato.setEmail(email);
	contato.setDataNascimento(dataNascimento);
	
	//salva
	ContatoDAO dao = new ContatoDAO();
	dao.adiciona(contato);
	
	//imprime o contato que foi add
	out.println("<html>");
	out.println("<body>");
	out.println("<Contato>" + contato.getNome() + "adicionado com sucesso");
	out.println("</html>");
	out.println("</body>");
	
	}
}


