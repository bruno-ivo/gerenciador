package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		System.out.println("MonitoramentoFilter");
		
		long antes = System.currentTimeMillis();
		
		//Executa a ação
		chain.doFilter(request, response);
		
		String acao = request.getParameter("acao");
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo de Execução da Ação: " + acao + "-> " + (depois - antes));
	}

}
