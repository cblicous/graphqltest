package de.cblicous.graphql;

import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

public class Mutation implements GraphQLMutationResolver {
    private PostDao postDao;
    private AuthorDao authorDao;
    
    public Mutation(PostDao postDao,AuthorDao authorDao) {
        this.postDao = postDao;
        this.authorDao = authorDao;
    }

    public Post writePost(String title, String text, String category, String author) {
        Post post = new Post();
        post.setId(UUID.randomUUID()
            .toString());
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(author);
        postDao.savePost(post);

        return post;
    }
    
    
    public Author createAuthor(String name, String thumbnail) {
        Author author = new Author();
        author.setName(name);
        author.setId(UUID.randomUUID()
            .toString());
        author.setThumbnail(thumbnail);
        authorDao.saveAuthor(author);
        return author;
    }
    
}