package Java_Excecoes.Conexao;

public class TesteConexao {
    public static void main(String[] args) {



        //------------------

        /*Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();

        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexão");

        } finally{
            System.out.println("Erro na conexão finally");
            if(con != null){
                con.close();

            }

        }**/

        //Fazendo o mesmo código de cima mas de forma resumida
        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch (IllegalStateException ex){
            System.out.println("Erro na conexão");
        }


    }
}