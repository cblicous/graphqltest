package de.cblicous.graphql;


import java.util.List;

import com.coxautodev.graphql.tools.GraphQLResolver;


/**
 * resolvers are for resolving of complex types
 * @author 
 *
 */
public class AuthorResolver implements GraphQLResolver<Author> {
    private PostDao postDao;

    public AuthorResolver(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> getPosts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}