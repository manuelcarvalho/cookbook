package pt.ulht.es.cookbook.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import pt.ist.fenixframework.pstm.RequestInfo;
import pt.ist.fenixframework.pstm.Transaction;

public class TransactionFilter implements Filter {

	
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		try {
			Transaction.begin(false);
			chain.doFilter(request, response);
		} finally {
			Transaction.forceFinish();
			RequestInfo.clear();
		}
	}

	
	public void destroy() {
	}

}