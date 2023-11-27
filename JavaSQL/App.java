package bd;

//import java.sql.ResultSet;
//import java.sql.SQLException;
//import com.mysql.jdbc.Statement;

public class App{
 
  public static void main(String[] args) {
  	
  	MenuPrincipal menu = new MenuPrincipal();
  	
      
		/*controla e executa uma instruçao sql
		Statement state;
			
		//conjunto de dados retornado por uma consulta sql
		ResultSet resultset;
	
		//instancia o objeto conex da classe Conexao
		Conexao conex = new Conexao();     
	
		String sql = "select * from tbCategoria";
					
		conex.conectar();      
					
		try{                  
				
			state = (Statement) Conexao.con.createStatement();
			resultset = state.executeQuery(sql);
				
				while(resultset.next()){
					//System.out.print(" "+resultset.getString("nomeDaColuna"));
					System.out.print(" "+resultset.getString(1));
					System.out.print(" "+resultset.getString(2)+"\n");
				}                         
		}
		catch(SQLException erro){
			System.out.println("Nao foi possível realizar a consulta");
		}     
			
		conex.desconectar();*/
  }    
}
