package de.cblicous.graphql;


import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {
    private PostDao postDao;
    private  AuthorDao authorDao;
    
    public Query(PostDao postDao, AuthorDao authorDao) {
        this.postDao = postDao;
        this.authorDao = authorDao;
    }

    public List<Post> recentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
    
    public List<Author> allAuthors() {
    	return authorDao.getAllAuthors();
    }
}