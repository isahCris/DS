package bd;
import java.sql.DriverManager;
import java.sql.SQLException; 
import java.sql.Connection;

public class Conexao {


	    
	       //cria uma conexao chamada con
		   static Connection con;   

		    //metodo responsavel para se conectar ao bd   
		    public void conectar(){
		        try{
		           //para carregar o driver
		           Class.forName("com.mysql.jdbc.Driver");

		           //jdbc - e o driver da sun responsavel pela conexao
		           //estabelece uma conexao 
		           con = DriverManager.getConnection("jdbc:mysql://localhost/dbGerenciamento","root","");

		           System.out.println("Conexão realizada com sucesso.");
		        }
		         catch(ClassNotFoundException ex){
			        System.out.println("Driver JDBC-ODBC não encontrado"); 
			    }	         
		         catch(SQLException ex){
		           System.out.println("Problemas na conexão com o banco de dados."); 
		        }         
		    }

		    public void desconectar(){
		         try{	           
		           con.close();
		           System.out.println("Conexao finalizada com sucesso");
		         }
		         catch(SQLException ex){
		            System.out.println("Problemas ao encerrar a conexão."); 
		         }
		    }
	    
	}
