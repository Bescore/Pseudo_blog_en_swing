package controller_blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dao.Connections;
import dao.Idao;
import modele_blog.Articles;
import modele_blog.User;

public class ArticleDao implements Idao<Articles> {
	Connection connect= new Connections().getConnection();
	@Override
	public boolean create(Articles object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Articles> read() {
		// TODO Auto-generated method stub
		ArrayList<Articles> tab_article=new ArrayList<Articles>();
		try {
			PreparedStatement sql=connect.prepareStatement("SELECT * FROM Article ");
			
			ResultSet rs = sql.executeQuery();
			
			
			while ( rs.next()) {
				
				Articles article= new Articles(rs.getString("titre"),rs.getString("contenu"),rs.getString("date"), rs.getString("auteur"));
				tab_article.add(article);
			} ;
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return tab_article;
	}

	@Override
	public ArrayList<Articles> readee(Articles object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Articles> findby(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
