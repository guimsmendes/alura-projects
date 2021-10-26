module br.com.alura.http {
	requires java.net.http;
	requires transitive br.com.alura.modelo;
	
	exports br.com.alura.http.dao;
}